package homework7.calculators;

public class EngineeringCalculator extends Calculator {

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public double numberToPower(double a, double b) {
        return Math.pow(a, b);
    }

    public double cosine(double a) {
        return Math.cos(a);
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