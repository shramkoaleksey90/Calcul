package com.dimonandpumba.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ICalculatorTest {
    private ICalculator iCalculator = new ICalculator() {
        @Override
        public double add(double x, double y) {
            return x+y;
        }

        @Override
        public double minus(double x, double y) {
            return x-y;
        }

        @Override
        public double multiply(double x, double y) {
            return x*y;
        }

        @Override
        public double divide(double x, double y) {
            return x/y;
        }
    };

    @Test
    public void add() {
       assertEquals(5,iCalculator.add(2,3),0);
    }

    @Test(expected = ArithmeticException.class)
    public void divide() {
        iCalculator.divide(5,0);
    }

}