package main.java.com.dimonandpumba.calculator;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println( "Hello it is simple calculator for nine digit numbers\n"+
                            "Enter first value");
        double x = scanner.nextDouble();

        System.out.println("Enter second value");
        double y = scanner.nextDouble();

        System.out.println("Select operation equal + - * or /");
        String c = scanner.next();

        double result = getResult(x, y, c);

        new View(result);
        scanner.close();
    }

    private static double getResult(double x, double y, String c) {
        Calculator calculator =  new Calculator();
        double result=0;
        switch (c) {
            case "+":
                result = calculator.add(x, y);
                break;
            case "-":
                result = calculator.minus(x, y);
                break;
            case "*":
                result=calculator.multiply(x, y);
                break;
            case "/":
                result=calculator.divide(x, y);
                break;
            default:
                System.out.println("Attention, wrong input, start over ");
                break;
        }
        return result;
    }
}
