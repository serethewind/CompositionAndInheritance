package Exceptions.Practice;

public class Circle {
    private int radius;
    double result;

//    public Circle(int radius) {
//        this.radius = radius;
//    }

    public double getRadius() {
        return radius;
    }

    private void validateRadius(int radius) {
        if (radius == 0 || radius < 0) {
            throw  new ArithmeticException("Radius cannot be zero or less than zero");
        } else {
            this.radius = radius;
        }
//        try{
//            this.radius = radius;
//        }
//        catch(ArithmeticException exception){
//            System.out.println(exception.getMessage());
//        }
    }

    public void setRadius(int radius) {
        validateRadius(radius);
    }

    public double area(){
        if (getRadius() == 0 || getRadius() < 0) {
            throw  new ArithmeticException("Radius cannot be less than zero");
        }
        return Math.PI * Math.pow(getRadius(), 2);
        

    }

    public double perimeter() throws ArithmeticException{

        try {
            result = 2 * Math.PI * getRadius();
        } catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }
        return result;
    }
}
