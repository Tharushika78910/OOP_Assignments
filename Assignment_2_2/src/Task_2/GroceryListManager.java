package Task_2;

import java.util.HashMap;

public class GroceryListManager {

    private HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double price) {
        groceryList.put(item, price);
    }

    public void displayList(){
        int index = 1;
        for (String item : groceryList.keySet()) {
            System.out.println(index + ". " + item + " - $" + groceryList.get(item));
            index++;
        }
    }

    public boolean checkItem(String item){
        return groceryList.containsKey(item);
    }

    public void removeItem(String item){
        groceryList.remove(item);
    }

    public double calculateTotalPrice(){
        double total = 0.0;
        for (double cost : groceryList.values()){
            total += cost;
        }
        return total;
    }
}

