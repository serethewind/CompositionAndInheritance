package exercise10_13;

public class Square extends TwoDimensionalShape {
    private double length;

    public Square(double length) {
        this.length = Math.abs(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = Math.abs(length);
    }

    @Override
    public String toString() {
        return "This shape is a square.";
    }

    @Override
    public double getArea() {
        return Math.pow(getLength(), 2);
    }
}
