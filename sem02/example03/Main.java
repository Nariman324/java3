package sem02.example03;

// Пример использования класса Calculator
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            double result = calculator.divide(10, 2);
            System.out.println("Division result: " + result);

            result = calculator.divide(5, 0);
            System.out.println("Division result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error details: " + e.getErrorDetails());
        }
    }
}
