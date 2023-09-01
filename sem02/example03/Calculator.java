package sem02.example03;

// Класс калькулятора
class Calculator {
    public double divide(double dividend, double divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.", dividend, divisor);
        }
        return dividend / divisor;
    }
}
