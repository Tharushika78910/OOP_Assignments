package Task_3;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public String toString() {
        return "Rectangle with width " + width + " and height " + height;
    }
}
