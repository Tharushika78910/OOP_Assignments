package Task_5;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<GroceryItem> groceryList = new ArrayList<>();

    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.add(new GroceryItem(item, cost, category, quantity));
    }

    public void displayList() {
        int index = 1;
        for (GroceryItem item : groceryList) {
            System.out.println(index + ". " + item);
            index++;
        }
    }

    public boolean checkItem(String item) {
        for (GroceryItem gi : groceryList) {
            if (gi.getName().equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }

    public void removeItem(String item) {
        groceryList.removeIf(gi -> gi.getName().equalsIgnoreCase(item));
    }

    public void displayByCategory(String category) {
        int index = 1;
        for (GroceryItem gi : groceryList) {
            if (gi.getCategory().equalsIgnoreCase(category)) {
                System.out.println(index + ". " + gi);
                index++;
            }
        }
        if (index == 1) {
            System.out.println("No items found in the category: " + category);
        }
    }

    public void updateQuantity(String item, int newQuantity) {
        for (GroceryItem gi : groceryList) {
            if (gi.getName().equalsIgnoreCase(item)) {
                gi.setQuantity(newQuantity);
                return;
            }
        }
        System.out.println("Item not found: " + item);
    }

    public void displayAvailableItems() {
        int index = 1;
        for (GroceryItem gi : groceryList) {
            if (gi.getQuantity() > 0) {
                System.out.println(index + ". " + gi);
                index++;
            }
        }
        if (index == 1) {
            System.out.println("No available items (all quantities are 0).");
        }
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (GroceryItem gi : groceryList) {
            total += gi.getCost() * gi.getQuantity();
        }
        return total;
    }
}

