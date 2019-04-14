package main.java.com.dimonandpumba.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(
                "Hello it is simple calculator for nine digit numbers\n"
                        +"Enter first value");
        double x = myScannerForDouble();

        System.out.println("Enter second value");
        double y = myScannerForDouble();

        System.out.println("Select operation equal + - * or /");
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        scanner.close();

        double result = getResult(x, y, c);

        new View(result);

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

    private static double myScannerForDouble(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
