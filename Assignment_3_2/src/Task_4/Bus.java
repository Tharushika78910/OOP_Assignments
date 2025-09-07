package Task_4;

public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus(String color, int capacity, double litersPer100km) {
        super("Bus", "Diesel", color, litersPer100km);
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Capacity: " + capacity + " passengers";
    }

    @Override
    public String calculateFuelEfficiency() {
        return "Fuel efficiency: " + fuelEfficiency + " liters per 100 km";
    }
}
