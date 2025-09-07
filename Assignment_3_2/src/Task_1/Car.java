package Task_1;

public class Car implements Vehicle {
    private String type = "Car";
    private String fuel = "Petrol";
    private String color = "Red";

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
        return "Car Information:\n" +
                "Type: " + type + "\n" +
                "Fuel: " + fuel + "\n" +
                "Color: " + color;
    }
}
