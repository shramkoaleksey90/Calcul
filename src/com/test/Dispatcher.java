package com.test;

import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {
        System.out.println("Hello it is simple calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter second value");
        int y = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Select operation from list");
        System.out.println("On your choice function:");
        System.out.println("Select 1 for add");
        System.out.println("Select 2 for minus");
        System.out.println("Select 3 for multiply");
        System.out.println("Select 4 for divide");

        Calculator calculator =  new Calculator();

        int z = scanner.nextInt();
        scanner.close();
        switch (z) {
            case 1: System.out.println("Result: "+calculator.add(x,y));
                    break;
            case 2: System.out.println("Result: "+calculator.minus(x,y));
                    break;
            case 3: System.out.println("Result: "+calculator.multiply(x,y));
                    break;
            case 4: System.out.println("Result: "+calculator.divide(x,y));
                    break;
        }
    }
}
