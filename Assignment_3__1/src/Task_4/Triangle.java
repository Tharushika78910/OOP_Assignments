package Task_4;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public String toString() {
        return "Triangle with base " + base + " and height " + height + " (color: " + color + ")";
    }
}
