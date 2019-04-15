package main.java.com.dimonandpumba.calculator;

import java.math.BigDecimal;

import static main.java.com.dimonandpumba.calculator.Main.scanner;

class View {
     View(double result) {
        if (result==(int)result) {
            System.out.println("The result of the operation is \n"+(int) result);
        }
        else {
            System.out.println( "The result of the operation is \n"+result+"\n"+
                                "I can round the result for you\n"+
                                "1) No Thanks current result is not bad\n"+
                                "2) Yes I need a rounding result");

            int ChoseRounding = scanner.nextInt();
            if (ChoseRounding == 1){
                System.out.println("The result of the operation is \n"+ result);
            }else {
                int scale = 0;
                BigDecimal bigDecimal = new BigDecimal(result);
                System.out.println(bigDecimal.setScale(scale, BigDecimal.ROUND_HALF_UP));
            }
        }
    }
}
