public class Main {
    public static void main(String[] args) {
        ShoppingList list = new ShoppingList();

        for (int i = 0; i < 5; i++) {
            String input = new InputString().inputData();
            if (input.equals("q")) break;

            System.out.println("Введите покупку, ее цену и количество через пробел");
            try {
                Item currentItem = new Item(input);
                if (list.contains(currentItem.getName())) {
                    list.addCountElememt(currentItem.getName(), currentItem);
                } else {
                    list.addItem(currentItem);
                }
            } catch (NumberFormatException exception) {
                System.out.println("Некорректный ввод данных");
            }

        }

        PrinterShoppingList printer = new PrinterShoppingList();
        printer.printList(list);
        printer.printAllCost(list);
        printer.top(list, 3);

    }
}
