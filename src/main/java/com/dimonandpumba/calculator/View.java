package com.dimonandpumba.calculator;

import java.math.BigDecimal;

class View {
    private double value;
    private Storage storage;

    View(double result, Storage storage) {
        value = result;
        this.storage = storage;
    }

    void output() {
        if (value == (int)value) {
            System.out.println("The result of the operation is \n"+(int) value);
            storage.writeStorage((int)value);
        }
        else {
            MyProperties myProperties = new MyProperties();
            int roundingMode = myProperties.getRoundingMode();
            int scale = myProperties.getScale();
            BigDecimal bigDecimal = new BigDecimal(value);
            value = bigDecimal.setScale(scale,roundingMode).doubleValue();
            System.out.println("The result of the operation is \n"+value);
            storage.writeStorage(value);
        }
    }
/*
    private double rounding(double result) {
        MyProperties myProperties = new MyProperties();
        int roundingMode = myProperties.getRoundingMode();
        int scale = myProperties.getScale();
        BigDecimal bigDecimal = new BigDecimal(result);
        return result = bigDecimal.setScale(scale,roundingMode).doubleValue();
    }

 */
}
