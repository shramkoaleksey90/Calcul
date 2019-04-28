package main.java.com.dimonandpumba.calculator;

import com.dimonandpumba.calculator.MyProperties;

import java.math.BigDecimal;

class View {
     View(double result) {
         output(result);
     }

    private void output(double result) {
        if (result == (int)result) {
            System.out.println("The result of the operation is \n"+(int) result);
        }
        else {
            System.out.println("The result of the operation is \n"+rounding(result));
        }
    }

    private double rounding(double result) {
        MyProperties myProperties =new MyProperties();
        int roundingMode = myProperties.getRoundingMode();
        int scale = myProperties.getScale();
        BigDecimal bigDecimal = new BigDecimal(result);
        return result = bigDecimal.setScale(scale,roundingMode).doubleValue();
    }
}
