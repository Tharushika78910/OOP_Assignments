package Task_4;

public class Motorcycle extends AbstractVehicle {
    public Motorcycle(String color, double mpg) {
        super("Motorcycle", "Gasoline", color, mpg);
    }

    @Override
    public String calculateFuelEfficiency() {
        return "Fuel efficiency: " + fuelEfficiency + " miles per gallon (mpg)";
    }
}

