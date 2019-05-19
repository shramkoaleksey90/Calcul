package com.dimonandpumba.calculator;

import java.math.BigDecimal;

class View {
    private double value;
    private Storage storage;


    View(double result) {
        value = result;
        storage = new Storage();
        value = output(value);
    }

    private double output(double result) {
        if (result == (int)result) {
            System.out.println("The result of the operation is \n"+(int) result);
            storage.writeStorage(result);
            return result;
        }
        else {
            System.out.println("The result of the operation is \n"+rounding(result));
            storage.writeStorage(result);
            return rounding(result);
        }
    }

    private double rounding(double result) {
        MyProperties myProperties = new MyProperties();
        int roundingMode = myProperties.getRoundingMode();
        int scale = myProperties.getScale();
        BigDecimal bigDecimal = new BigDecimal(result);
        return result = bigDecimal.setScale(scale,roundingMode).doubleValue();
    }
}
