package exercise10_13;

public class Triangle extends TwoDimensionalShape {
    private double base;

    private double height;

    public Triangle(double base, double height) {
        this.base = Math.abs(base);
        this.height = Math.abs(height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = Math.abs(base);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.abs(height);
    }

    @Override
    public String toString() {
        return "This shape is a triangle.";
    }

    @Override
    public double getArea() {
        return 0.5 * getBase() * getHeight();
    }
}
