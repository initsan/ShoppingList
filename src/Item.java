public class Item {
    private String name;
    private double cost;
    private int count;

    public Item(String input) {
        //много лишних объектов и операций
        String[] parts = input.split(" ");
        this.name = parts[0];
        this.cost = Double.parseDouble(parts[1]);
        this.count = Integer.parseInt(parts[2]);
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
