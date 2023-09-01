package sem03.example01;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        String operation = scanner.next();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        scanner.close();
        
        try {
            double result = 0;
            switch (operation) {
                case "+":
                    result = calculator.add(a, b);
                    break;
                case "-":
                    result = calculator.subtract(a, b);
                    break;
                case "*":
                    result = calculator.multiply(a, b);
                    break;
                case "/":
                    result = calculator.divide(a, b);
                    break;
                default:
                    throw new InvalidInputException("Неверная операция");
            }
            System.out.println("Результат: " + result);
        } catch (ArithmeticException | InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

