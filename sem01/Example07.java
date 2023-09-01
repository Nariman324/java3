/*
 *  Напишите программу, которая будет запрашивать у пользователя два числа
 * и выводить результат их деления.
 * Если пользователь вводить некорректные данные (например, буквы или деление на 0),
 * программа должна выводить сообщение "Ошибка" и просить пользователя ввести число заново.
 * 
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean validInput = false;
        int dividend = 0;
        int divisor = 0;

        while (!validInput) {
            try {
                System.out.print("Enter the first number: ");
                dividend = input.nextInt();

                System.out.print("Enter the second number: ");
                divisor = input.nextInt();

                double result = (double) dividend / (double) divisor;
                System.out.println("Result: " + result);

                validInput = true;

            } catch (ArithmeticException exception) {
                System.out.println("Ошибка: деление на 0 недопустимо.");
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите числа.");
                input.nextLine();
            }
        }

        input.close();
    }
}
