package Task_4;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle with radius " + radius + " (color: " + color + ")";
    }
}
