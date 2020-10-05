import java.util.*;

public class PrinterShoppingList {

    private ShoppingList list;

    public PrinterShoppingList(ShoppingList list) {
        this.list = list;
    }

    public void printList() {
        System.out.println("Список покупок:");
        for (Map.Entry<String, Item> entry : list.getListItems().entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.println();
    }

    public void printAllCost() {
        System.out.println("Общая сумма " + list.getCost());
        System.out.println();
    }


    public void top(ShoppingList list, int top) {
        List<String> listCounts = new ArrayList<>();
        for (Map.Entry<String, Item> entry : list.getListItems().entrySet()) {
            listCounts.add(entry.getValue().getCount() + " " + entry.getKey());
        }

        listCounts.sort(Comparator.reverseOrder());

        System.out.println("ТОП-" + top + " списка");
        for (int i = 0; i < top && i < listCounts.size(); i++) {
            System.out.println(listCounts.get(i));
        }


    }
}
