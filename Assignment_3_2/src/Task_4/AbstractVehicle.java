package Task_4;

import Task_3.ElectricVehicle;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type;
    protected String fuel;
    protected String color;
    protected double fuelEfficiency;

    public AbstractVehicle(String type, String fuel, String color, double fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
        this.fuelEfficiency = fuelEfficiency;
    }

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
        return type + " Information:\n" +
                "Type: " + type + "\n" +
                "Fuel: " + fuel + "\n" +
                "Color: " + color;
    }

    @Override
    public void charge() {
        System.out.println(type + ": Not possible to charge.");
    }

    @Override
    public String calculateFuelEfficiency() {
        return "Fuel efficiency: " + fuelEfficiency;
    }
}

