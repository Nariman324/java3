// throw - руками выбрасывает исключение

public class Example06 {
    public static void main(String[] args) {
        try {
            int numerator = 18;
            int denominator = 0;

            if (denominator == 0) {
                throw new ArithmeticException("Division by zero");
            }

            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException exception) {
            System.out.println("Arithmetic exception caught: " + exception.getMessage());
            System.out.println(exception);
            exception.printStackTrace();
            System.out.println(exception.getLocalizedMessage());
        }

    }
}

// ArithmeticException exception = new ArithmeticException("Division by zero");