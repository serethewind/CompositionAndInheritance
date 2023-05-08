package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {

    public static double quotient(int numerator, int denominator) throws ArithmeticException{
        return numerator/denominator;
    }

    public static double quotient(double numerator, double denominator){
        if (denominator != 0){
            return numerator/denominator;
        }
        throw new ArithmeticException("Your denominator should not be less than 1");
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter another integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter another integer:");
        int num2 = scanner.nextInt();
        try{
            System.out.println(quotient(num1, num2));
        } catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        } catch (InputMismatchException exception){
            System.out.println(exception.getMessage());
        }



        System.out.println("Let's try the second method");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        System.out.println(quotient(firstNumber,secondNumber));

        System.out.println("Thank you for using this system.");
    }
}
