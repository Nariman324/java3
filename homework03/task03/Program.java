/*
 * Задача 3: Мини-калькулятор (ООП, исключения, коллекции) - по желанию
*/

package homework03.task03;

import java.util.InputMismatchException;
import java.util.Scanner;

import homework03.task03.Operations.Add;
import homework03.task03.Operations.Divide;
import homework03.task03.Operations.Exponentiation;
import homework03.task03.Operations.MathOperations;
import homework03.task03.Operations.Multiply;
import homework03.task03.Operations.Subtract;

public class Program {
    public static void main(String[] args) {

        System.out.println("\nКалькулятор открыт.");
        Scanner scanner = new Scanner(System.in);
        MiniCalculator miniCalculator = new MiniCalculator();

        int firstNumber;
        int secondNumber;
        String operation = "";

        while (!operation.equals("exit")) {
            System.out.print("\nВведите операцию ( +, -, *, / , history, exit): ");
            operation = scanner.nextLine();
            if (operation.equals("exit")) {
                System.out.printf("Калькулятор закрыт.");
                System.exit(0);
            }
            if (operation.equals("history")) {
                System.out.println("История операций: ");
                miniCalculator.printAllOperations();
            } else {

                try {
                    System.out.print("Введите первое число: ");
                    firstNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите второе число: ");
                    secondNumber = scanner.nextInt();
                    scanner.nextLine();

                    switch (operation) {
                        case "+":
                            MathOperations add = new Add(firstNumber, secondNumber);
                            miniCalculator.newOperation(add);
                            System.out.printf("Сумма чисел равна: %.0f", add.getResult());
                            break;
                        case "-":
                            MathOperations subtract = new Subtract(firstNumber, secondNumber);
                            miniCalculator.newOperation(subtract);
                            System.out.printf("Разность чисел равна: %.0f", subtract.getResult());
                            break;
                        case "*":
                            MathOperations multyply = new Multiply(firstNumber, secondNumber);
                            miniCalculator.newOperation(multyply);
                            System.out.printf("Произведение чисел равно: %.0f", multyply.getResult());
                            break;
                        case "/":
                            try {
                                MathOperations divide = new Divide(firstNumber, secondNumber);
                                miniCalculator.newOperation(divide);
                                System.out.printf("Частное чисел равно: %.2f", divide.getResult());
                            } catch (ArithmeticException e) {
                                System.out.println("Ошибка: " + e.getMessage());
                            }
                            break;
                        case "^":
                            MathOperations exponent = new Exponentiation(firstNumber, secondNumber);
                            miniCalculator.newOperation(exponent);
                            System.out.printf("Произведение чисел равно: %.0f", exponent.getResult());
                            break;
                        default:
                            System.out.println("Такой операции не существует.");
                            break;
                    }
                } catch (InputMismatchException exception) {
                    System.out.println("Ошибка: Необходимо ввести целые числа.");
                }
            }

        }
        scanner.close();
    }
}
