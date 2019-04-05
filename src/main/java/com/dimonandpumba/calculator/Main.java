package main.java.com.dimonandpumba.calculator;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private final static int min = -999_999_999;
    private final static int max = 999_999_999;

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

        if (result==(int)result) {
            System.out.println((int) result);
        }
        else {
            System.out.println(result);
        }
    }
    private static int myScannerForInteger (){
        int number = scanner.nextInt();
        if (number < min || number > max) throw new ArithmeticException();
        return number;
    }
}