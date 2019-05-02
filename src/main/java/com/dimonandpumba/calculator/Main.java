package com.dimonandpumba.calculator;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println( "Hello it is simple calculator\n"+
                            "Enter first value");
        double x;
        while (!scanner.hasNextDouble()){
            System.out.println("Enter a value");
            scanner.next();
        }
        x = scanner.nextDouble();

        System.out.println("Select operation equal + - * or /");
        while (!scanner.hasNext("[+\\-/*]")) {
            System.out.println("That is not a operation!");
            scanner.next();
        }
        String c = scanner.next();

        System.out.println("Enter second value");
        double y;
        while (!scanner.hasNextDouble()){
            System.out.println("Enter a value");
            scanner.next();
        }
        y = scanner.nextDouble();

        double result = getResult(x, y, c);

        View view = new View(result);
        new Storage(view.getValue());

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
                result = calculator.multiply(x, y);
                break;
            case "/":
                result = calculator.divide(x, y);
                break;
            default:
                System.out.println("Attention, wrong input, start over");
                break;
        }
        return result;
    }
}
