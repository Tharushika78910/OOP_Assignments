package Task_1;

public class Bus implements Vehicle {
    private String type = "Bus";
    private String fuel = "Diesel";
    private int capacity = 40;

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
        return "Bus Information:\n" +
                "Type: " + type + "\n" +
                "Fuel: " + fuel + "\n" +
                "Capacity: " + capacity + " passengers";
    }
}
