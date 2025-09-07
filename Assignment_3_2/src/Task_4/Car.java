package Task_4;

public class Car extends AbstractVehicle {
    public Car(String color, double mpg) {
        super("Car", "Petrol", color, mpg);
    }

    @Override
    public String calculateFuelEfficiency() {
        return "Fuel efficiency: " + fuelEfficiency + " miles per gallon (mpg)";
    }
}
