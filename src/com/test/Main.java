package com.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello it is simple calculator for four digit numbers");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first value");
        int x = scanner.nextInt();
        if(x>9999) throw new ArithmeticException();
        scanner.nextLine();

        System.out.println("Enter second value");
        int y = scanner.nextInt();
        if(y>9999) throw new ArithmeticException();
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
