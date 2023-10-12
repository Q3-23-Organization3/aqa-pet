package homework6;

public class Calculator {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error! Division by 0 is impossible");
            throw new ArithmeticException("Division by zero");
        }
    }
}
