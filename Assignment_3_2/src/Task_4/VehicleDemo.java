package Task_4;

import Task_3.ElectricVehicle;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        Vehicle car = new Car("Red", 30);
        car.start();
        car.stop();
        System.out.println(car.getInfo());
        System.out.println(car.calculateFuelEfficiency());
        ((ElectricVehicle) car).charge();
        System.out.println();

        Vehicle motorcycle = new Motorcycle("Black", 50);
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        System.out.println(motorcycle.calculateFuelEfficiency());
        ((ElectricVehicle) motorcycle).charge();
        System.out.println();

        Vehicle bus = new Bus("Blue", 40, 25);
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
        System.out.println(bus.calculateFuelEfficiency());
        ((ElectricVehicle) bus).charge();
        System.out.println();

        Vehicle electricCar = new ElectricCar("White", 75, 0.2);
        electricCar.start();
        electricCar.stop();
        System.out.println(electricCar.getInfo());
        System.out.println(electricCar.calculateFuelEfficiency());
        ((ElectricVehicle) electricCar).charge();
        System.out.println();

        Vehicle electricMotorcycle = new ElectricMotorcycle("Green", 20, 0.1);
        electricMotorcycle.start();
        electricMotorcycle.stop();
        System.out.println(electricMotorcycle.getInfo());
        System.out.println(electricMotorcycle.calculateFuelEfficiency());
        ((ElectricVehicle) electricMotorcycle).charge();
    }
}
