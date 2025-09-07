package Task_1;

public class Motorcycle implements Vehicle {
    private String type = "Motorcycle";
    private String fuel = "Gasoline";
    private String color = "Black";

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public String getInfo() {
        return "Motorcycle Information:\n" +
                "Type: " + type + "\n" +
                "Fuel: " + fuel + "\n" +
                "Color: " + color;
    }
}
