import java.util.*;

public class ShoppingList {
    private Map<String, Item> listItems;
    private double allCost;

    public ShoppingList() {
        this.listItems = new TreeMap<>();
        this.allCost = 0;
    }

    public boolean contains(String name) {
        return listItems.containsKey(name);
    }

    public void addCountElement(String name, Item item) {
        if (this.listItems.containsKey(name)) {
            int currentCount = this.listItems.get(name).getCount();
            item.setCount(currentCount);
            listItems.replace(name, item);
            //так лучше не делать, потому что при изменении логики можно получить неконсситентный объект.
            //например, добавим удаление или уменьщение, там нужно тоже заботиться об изменении кол-ва.
            //лучше считать сразу перед тем как попросят, т.е. в методе getCost()
            this.allCost += this.listItems.get(name).getCost() * currentCount;
        }
    }

    public void addItem(Item currentItem) {
        this.listItems.put(currentItem.getName(), currentItem);
        this.allCost += currentItem.getCost() * currentItem.getCount();
    }

    public Map<String, Item> getListItems() {
        return this.listItems;
    }

    public double getCost() {
        return this.allCost;
    }

}
