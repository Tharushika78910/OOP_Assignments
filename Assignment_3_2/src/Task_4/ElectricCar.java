package Task_4;

public class ElectricCar extends AbstractVehicle {
    private int batteryCapacity; // in kWh

    public ElectricCar(String color, int batteryCapacity, double kWhPerKm) {
        super("Electric Car", "Electricity", color, kWhPerKm);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void charge() {
        System.out.println(type + " is charging. Battery capacity: " + batteryCapacity + " kWh");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Battery Capacity: " + batteryCapacity + " kWh";
    }

    @Override
    public String calculateFuelEfficiency() {
        return "Energy efficiency: " + fuelEfficiency + " kWh per km";
    }
}

