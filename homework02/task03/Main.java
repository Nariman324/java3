/*
 * Задача3: - по желанию
Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:
1. Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
2. Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
3. Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
4. Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
- необходимо создать 3 класса собственных исключений
*/

package homework02.task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            int firstNum = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int secondNum = scanner.nextInt();
            System.out.print("Введите третье число: ");
            int thirdNum = scanner.nextInt();
            scanner.close();

            if (firstNum > 100)
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона.");
            if (secondNum < 0)
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона.");
            if ((firstNum + secondNum) < 10)
                throw new NumberSumException("Сумма первого и второго чисел слишком мала.");
            if (thirdNum == 0)
                throw new DivisionByZeroException("Деление на ноль недопустимо.");

            System.out.println("Прверка пройдена успешно");

        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
