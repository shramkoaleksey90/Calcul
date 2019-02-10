package main.java.com.dimonandpumba.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int min = -999_999_999;
        final int max = 999_999_999;
        System.out.println("Hello it is simple calculator for nine digit numbers");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first value");
        int x = scanner.nextInt();
        if(x<min||x>max) throw new ArithmeticException();
        scanner.nextLine();

        System.out.println("Enter second value");
        int y = scanner.nextInt();
        if(y<min||y>max) throw new ArithmeticException();
        scanner.nextLine();

        System.out.println("Select operation equal + - * or /");

        Calculator calculator =  new Calculator();

        String c = scanner.next();
        scanner.close();
        if (c.equals("+")) {
            System.out.println(calculator.add(x,y));
        }
        if (c.equals("-")) {
            System.out.println(calculator.minus(x,y));
        }
        if (c.equals("*")) {
            System.out.println(calculator.multiply(x,y));
        }
        if (c.equals("/")) {
            System.out.println(calculator.divide(x,y));
        }
    }
}
