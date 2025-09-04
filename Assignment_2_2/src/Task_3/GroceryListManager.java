package Task_3;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<GroceryItem> groceryList = new ArrayList<>();

    public void addItem(String item, double cost, String category) {
        groceryList.add(new GroceryItem(item, cost, category));
    }

    public void displayList() {
        int index = 1;
        for (GroceryItem item1 : groceryList) {
            System.out.println(index + ". " + item1);
            index++;
        }
    }

    public boolean checkItem(String item) {
        for (GroceryItem item2 : groceryList) {
            if (item2.getName().equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }

    public void removeItem(String item) {
        groceryList.removeIf(item2 -> item2.getName().equalsIgnoreCase(item));
    }

    public void displayByCategory(String category) {
        int index = 1;

        for (GroceryItem item : groceryList) {
            if (item.getCategory().equalsIgnoreCase(category)) {
                System.out.println(index + ". " + item);
                index++;
            }
        }

        if(index==1){
            System.out.println("No items found in the category "+category);
        }
    }
}
