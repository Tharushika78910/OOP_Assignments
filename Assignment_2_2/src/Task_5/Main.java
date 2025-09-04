package Task_5;

public class Main {
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples", 2.5, "Fruits", 5);
        manager.addItem("Milk", 1.8, "Dairy", 2);
        manager.addItem("Bread", 2.0, "Bakery", 1);
        manager.addItem("Cheese", 3.5, "Dairy", 3);

        System.out.println("Full Grocery List:");
        manager.displayList();
        System.out.println();

        System.out.println("Total Cost: $" + manager.calculateTotalCost());
        System.out.println();

        manager.addItem("Oranges", 3.2, "Fruits", 6);

        System.out.println("Full Grocery List:");
        manager.displayList();
        System.out.println();

        System.out.println("Total Cost: $" + manager.calculateTotalCost());
        System.out.println();

        System.out.println("Items in category 'Dairy':");
        manager.displayByCategory("Dairy");
        System.out.println();

        System.out.println("Items in category 'Fruits':");
        manager.displayByCategory("Fruits");
        System.out.println();

        System.out.println("Available Items (Qty > 0):");
        manager.displayAvailableItems();
        System.out.println();

        System.out.println("Updating quantity of Milk to 0...");
        manager.updateQuantity("Milk", 0);
        System.out.println();

        System.out.println("Available Items after update:");
        manager.displayAvailableItems();
        System.out.println();

        manager.addItem("Pears", 2.8, "Fruits", 3);
        System.out.println("New item added.");
        System.out.println();

        System.out.println("Available Items after update:");
        manager.displayAvailableItems();
        System.out.println();

        System.out.println("Total Cost after update: $" + manager.calculateTotalCost());
    }
}
