/*
 * Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
В противном случае, программа должна выводить сообщение "Число корректно".
*/

package homework02.task01;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            scanner.close();
            if (num < 1) {
                throw new NegativeNumberException("Некорректное число.");
            }
            System.out.println("Число корректно.");
            
        } catch (NegativeNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}