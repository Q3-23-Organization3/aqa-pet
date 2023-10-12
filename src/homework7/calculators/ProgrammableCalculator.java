package homework7.calculators;

public class ProgrammableCalculator extends Calculator {

    public static double tangent(double b) {
        return Math.tan(b);
    }
    public static double sine(double b) {
        return Math.sin(b);
    }
    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by 0 is impossible");
        }
    }
}
