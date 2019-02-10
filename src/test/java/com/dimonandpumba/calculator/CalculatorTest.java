package test.java.com.dimonandpumba.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    main.java.com.dimonandpumba.calculator.Calculator calculator = new main.java.com.dimonandpumba.calculator.Calculator();

    @Test
    public void add(){
        double d = calculator.add(1,2);
        assertEquals(3,d,0);
    }

    @Test
    public void minus() {
    }

    @Test
    public void multiply() {
    }

    @Test(expected = ArithmeticException.class)
    public void divide() {
        calculator.divide(5,0);
    }
}