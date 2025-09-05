package Task_2;

public class Bus extends Car {
    private int passengers;
    private int capacity;

    public Bus(String typeName, int capacity) {
        super(typeName);
        this.capacity = Math.max(1, capacity);
        this.passengers = 0;
    }

    public Bus(double speed, double gasolineLevel, String typeName, int capacity) {
        super(speed, gasolineLevel, typeName);
        this.capacity = Math.max(1, capacity);
        this.passengers = 0;
    }

    public void passengerEnter() {
        if (passengers < capacity) {
            passengers++;
            System.out.println("One passenger entered. Total: " + passengers);
        } else {
            System.out.println("Bus is full! Capacity: " + capacity);
        }
    }

    public void passengerExit() {
        if (passengers > 0) {
            passengers--;
            System.out.println("One passenger exited. Total: " + passengers);
        } else {
            System.out.println("No passengers to exit.");
        }
    }

    public int getPassengers() {
        return passengers;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return getTypeName() + " Bus | Speed: " + getSpeed() +
                " km/h | Fuel: " + getGasolineLevel() +
                "% | Passengers: " + passengers + "/" + capacity;
    }
}
