package Task_3;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        Vehicle car = new Car("Red");
        car.start();
        car.stop();
        System.out.println(car.getInfo());
        ((ElectricVehicle) car).charge(); // Will print "Not possible to charge."
        System.out.println();

        Vehicle motorcycle = new Motorcycle("Black");
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        ((ElectricVehicle) motorcycle).charge();
        System.out.println();

        Vehicle bus = new Bus("Blue", 40);
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
        ((ElectricVehicle) bus).charge();
        System.out.println();

        Vehicle electricCar = new ElectricCar("White", 75);
        electricCar.start();
        electricCar.stop();
        System.out.println(electricCar.getInfo());
        ((ElectricVehicle) electricCar).charge();
        System.out.println();

        Vehicle electricMotorcycle = new ElectricMotorcycle("Green", 20);
        electricMotorcycle.start();
        electricMotorcycle.stop();
        System.out.println(electricMotorcycle.getInfo());
        ((ElectricVehicle) electricMotorcycle).charge();
    }
}
