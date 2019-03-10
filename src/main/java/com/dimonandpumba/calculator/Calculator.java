package main.java.com.dimonandpumba.calculator;

public class Calculator implements ICalculator {
    @Override
    public double add(int x, int y) {
        return x+y;
    }

    @Override
    public double minus(int x, int y) {
        return x-y;
    }

    @Override
    public double multiply(int x, int y) {
        return x*y;
    }

    @Override
    public double divide(int x, int y) {
        if(y==0) throw new ArithmeticException();
        return (double)x/y;
    }
}
