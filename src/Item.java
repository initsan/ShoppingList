public class Item {
    private String name;
    private double cost;
    private int count;

    public Item(String input) throws NumberFormatException{
        this.name = input.split(" ")[0];
        this.cost = Double.parseDouble(input.split(" ")[1]);
        this.count = Integer.parseInt(input.split(" ")[2]);
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
