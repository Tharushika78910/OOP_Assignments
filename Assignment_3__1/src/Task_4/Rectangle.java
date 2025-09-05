package Task_4;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public String toString() {
        return "Rectangle with width " + width + " and height " + height + " (color: " + color + ")";
    }
}
