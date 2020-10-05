public class Main {
    public static void main(String[] args) {
        ShoppingList list = new ShoppingList();

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите покупку, ее цену и количество через пробел");

            //плохо. создавались каждый раз новые объекты. НЕобходимости в этом нет. Перевел в статику.
            String input = InputString.inputData();
            if ("q".equals(input)) {
                break;
            }

            try {
                Item currentItem = new Item(input);
                if (list.contains(currentItem.getName())) {
                    list.addCountElement(currentItem.getName(), currentItem);
                } else {
                    list.addItem(currentItem);
                }
            } catch (NumberFormatException exception) {
                System.out.println("Некорректный ввод данных");
            }

        }

        //если не передавать тут параметр в конструктор - то нет смысла создавать объект. Тут могди бы справиться статические методы.
        PrinterShoppingList printer = new PrinterShoppingList(list);
        printer.printList();
        printer.printAllCost();
        printer.top(3);

    }
}
