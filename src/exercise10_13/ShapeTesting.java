package exercise10_13;

public class ShapeTesting {
    public static void main(String[] args) {
        Shape[] shapeObjects = new Shape[]{
                new Circle(14),
                new Triangle(6, 12),
                new Square(9),
                new Sphere(24),
                new Tetrahedron(16),
                new Cube(14)
        };

        for (Shape currentShape : shapeObjects) {
            System.out.println(currentShape);
            if (currentShape instanceof TwoDimensionalShape) {
                System.out.printf("The area of the shape is ");
                System.out.printf("%.2f \n",currentShape.getArea());
            }
            if (currentShape instanceof ThreeDimensionalShape) {
                System.out.printf("The area of the shape is ");
                System.out.printf("%.2f \n",currentShape.getArea());
                System.out.printf("The volume of the shape is ");
                System.out.printf("%.2f \n", ((ThreeDimensionalShape) currentShape).getVolume());
            }
        }
    }
}

