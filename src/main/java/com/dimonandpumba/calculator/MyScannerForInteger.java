package main.java.com.dimonandpumba.calculator;

import java.util.Scanner;

public class MyScannerForInteger {
    static Scanner scanner = new Scanner(System.in);
    final static int min = -999_999_999;
    final static int max = 999_999_999;

    public static int myScannerForInteger (){
        int number = scanner.nextInt();
        if (number < min|| number > max) throw new ArithmeticException();
        return number;
    }
}
