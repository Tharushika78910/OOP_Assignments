package Task_1;

import Task_2.Car;

public class SportsCar extends Car {

    public SportsCar(String typeName) {
        super(typeName);
    }

    public SportsCar(double speed, double gasolineLevel, String typeName) {
        super(speed, gasolineLevel, typeName);
    }

    public void accelerate() {
        if (getGasolineLevel() > 0) {
            super.accelerate();
            super.accelerate();
            consumeGasoline(2.0);
        } else {
            super.decelerate((int) getSpeed());
        }
    }

    public void decelerate(int amount) {
        super.decelerate(amount * 2);
        consumeGasoline(1.0);
    }

    private void consumeGasoline(double amount) {
        double newLevel = Math.max(0, getGasolineLevel() - amount);
        try {
            java.lang.reflect.Field field = Car.class.getDeclaredField("gasolineLevel");
            field.setAccessible(true);
            field.setDouble(this, newLevel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
