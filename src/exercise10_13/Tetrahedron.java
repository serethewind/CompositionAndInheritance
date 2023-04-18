package exercise10_13;

public class Tetrahedron extends ThreeDimensionalShape {
    private double side;

    public Tetrahedron(double side) {
        this.side = Math.abs(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = Math.abs(side);
    }


    @Override
    public double getArea() {
        return (Math.sqrt(3)) * Math.pow(getSide(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getSide(), 3) / (Math.sqrt(2) * 6);
    }

    @Override
    public String toString() {
        return "This shape is a tetrahedron.";
    }
}
