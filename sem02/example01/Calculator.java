package sem02.example01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое положительное число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе положительное число: ");
        int num2 = scanner.nextInt();
        scanner.close();

        try {
            if (num1 <= 0 || num2 <= 0) {
                throw new NegativeNumberException("Введено отрицательное число или ноль");
            }

            System.out.println("Выберите операцию (+ для сложения, / для деления): ");
            char operation = scanner.next().charAt(0);

            switch (operation) {
                case '+':
                    int sum = num1 + num2;
                    System.out.println("Результат сложения: " + sum);
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new DivisionByZeroException("Деление на ноль недопустимо");
                    }
                    double divisionResult = (double) num1 / num2;
                    System.out.println("Результат деления: " + divisionResult);
                    break;
                default:
                    System.out.println("Некорректная операция");
            }
        } catch (NegativeNumberException | DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }
}
