package exercise10_13;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = Math.abs(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.abs(radius);
    }

    @Override
    public String toString() {
        return "This shape is a circle.";
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(getRadius(), 2));
    }
}
