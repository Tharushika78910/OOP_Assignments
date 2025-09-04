package Task_5;

public class GroceryItem {
    private String name;
    private double cost;
    private String category;
    private int quantity;

    public GroceryItem(String name, double cost, String category, int quantity) {
        this.name = name;
        this.cost = cost;
        this.category = category;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    @Override
    public String toString() {
        return name + " - $" + cost + " (" + category + "), Qty: " + quantity;
    }
}

