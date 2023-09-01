/*
 * Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить результат деления.
*/

package homework02.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            int firstNum = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int secondNum = scanner.nextInt();
            scanner.close();
            
            if (secondNum == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо.");
            }
            System.out.println("Результат деления: " + ((double) firstNum / (double) secondNum));

        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
