package Task_4;

public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Generic Shape (color: " + color + ")";
    }
}
