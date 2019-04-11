package test.java.com.dimonandpumba.calculator;

import main.java.com.dimonandpumba.calculator.ICalculator;
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
/*
    @Test
    public void add() {
       assertEquals(5,iCalculator.add(2,3),0);
    }

    @Test(expected = ArithmeticException.class)
    public void divide() {
        iCalculator.divide(5,0);
    }

    @Test
    public void multiply() {
        assertEquals(-1294967299,
                iCalculator.multiply(999_999_999,3),0);
        // ;-P
    }
*/
}