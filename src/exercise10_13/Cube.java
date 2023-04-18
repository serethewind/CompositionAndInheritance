package exercise10_13;

public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double getArea() {
        return 6 * Math.pow(getSide(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getSide(), 3);
    }

    @Override
    public String toString() {
        return "This shape is a cube.";
    }
}
