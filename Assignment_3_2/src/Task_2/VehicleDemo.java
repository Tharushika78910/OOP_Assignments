package Task_2;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        Vehicle car = new Car("Red");
        car.start();
        car.stop();
        System.out.println(car.getInfo() + "\n");

        Vehicle motorcycle = new Motorcycle("Black");
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo() + "\n");

        Vehicle bus = new Bus("Blue", 40);
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo() + "\n");
    }
}
