package test.java.com.dimonandpumba.calculator;

import main.java.com.dimonandpumba.calculator.Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

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