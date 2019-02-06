public class Calculator implements ICalcul{
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
        /*
        double z =0;
        try {
            z=(double)x/y;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic mistake");
        }
        */
        return (double)x/y;
    }
}
