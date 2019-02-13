package main.java.com.dimonandpumba.calculator;

import java.util.Scanner;

public class MyScannerForInteger {
    static Scanner scanner = new Scanner(System.in);
    final static int min = Integer.MIN_VALUE;
    final static int max = Integer.MAX_VALUE;

    public static int myScannerForInteger (){
        int number = scanner.nextInt();
        if (number < min|| number > max) throw new ArithmeticException();
        return number;
    }
}
