package sem03.example01;

public class Calculator {
    public double add(double a, double b) throws ArithmeticException {
        return a + b;
    }

    public double subtract(double a, double b) throws ArithmeticException {
        return a - b;
    }

    public double multiply(double a, double b) throws ArithmeticException {
        return a * b;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a / b;
    }
}
