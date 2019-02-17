package main.java.com.dimonandpumba.calculator;

import java.util.Scanner;

public class Main extends MyScannerForInteger{

    public static void main(String[] args) {

        System.out.println(
                "Hello it is simple calculator for nine digit numbers\n"
                        +"Enter first value");
        int x = myScannerForInteger();

        System.out.println("Enter second value");
        int y = myScannerForInteger();

        System.out.println("Select operation equal + - * or /");

        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        scanner.close();

        Calculator calculator =  new Calculator();

        switch (c) {
            case "+":
                System.out.println(calculator.add(x, y));
                break;
            case "-":
                System.out.println(calculator.minus(x, y));
                break;
            case "*":
                System.out.println(calculator.multiply(x, y));
                break;
            case "/":
                System.out.println(calculator.divide(x, y));
                break;
            default:
                System.out.println("Attention, wrong input, start over ");
                break;
        }
    }
}
