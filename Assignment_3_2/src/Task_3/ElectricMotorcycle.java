package Task_3;

public class ElectricMotorcycle extends AbstractVehicle {
    private int batteryCapacity; // in kWh

    public ElectricMotorcycle(String color, int batteryCapacity) {
        super("Electric Motorcycle", "Electricity", color);
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
}

