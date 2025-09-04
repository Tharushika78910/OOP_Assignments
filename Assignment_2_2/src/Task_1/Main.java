package Task_1;

public class Main {

    public static void main(String[] args) {

        GroceryListManager gl_manager = new GroceryListManager();

        gl_manager.addItem("Apples");
        gl_manager.addItem("Milk");
        gl_manager.addItem("Bread");

        System.out.println("Grocery List:");
        gl_manager.displayList();
        System.out.println();

        System.out.println("Is \"Milk\" in the grocery list? " + gl_manager.checkItem("Milk"));
        System.out.println();

        System.out.println("Removing \"Milk\" from the list...");
        gl_manager.removeItem("Milk");
        System.out.println();

        System.out.println("Updated Grocery List:");
        gl_manager.displayList();
    }
}
