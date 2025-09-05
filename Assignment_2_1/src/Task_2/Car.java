package Task_2;

public class Car {

    private double speed;
    private double gasolineLevel;
    private String typeName;


    public Car(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
    }

    public Car(double speed, double gasolineLevel, String typeName) {
        this.typeName = typeName;
        this.speed = Math.max(0, speed);
        this.gasolineLevel = Math.min(100, Math.max(0,gasolineLevel));
    }
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    public double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    protected double getGasolineLevel() {
        return gasolineLevel;
    }
}
