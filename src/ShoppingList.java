import java.util.*;

public class ShoppingList {
    private Map<String, Item> listItems;
    private double allCost;

    public ShoppingList() {
        this.listItems = new TreeMap<>();
        this.allCost = 0;
    }

    public boolean contains(String name) {
        if (listItems.containsKey(name))
            return true;
        else return false;
    }

    public void addCountElememt(String name, Item item) {
        if (this.listItems.containsKey(name)) {
            int currentCount = this.listItems.get(name).getCount();
            item.setCount(currentCount);
            listItems.replace(name, item);
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
