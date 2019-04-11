package main.java.com.dimonandpumba.calculator;

public class Calculator implements ICalculator {
    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double minus(double x, double y) {
        return x-y;
    }

    @Override
    public double multiply(double x,double y) {
        return x*y;
    }

    @Override
    public double divide(double x, double y) {
        if(y==0) throw new ArithmeticException();
        return x/y;
    }
}
