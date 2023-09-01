/*
 * Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)
Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет его на соответствие следующим правилам:
Пароль должен быть не менее 8 символов.
Пароль должен содержать хотя бы одну цифру.
Пароль должен содержать хотя бы одну заглавную букву.
Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.

*/

package homework03.task01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PasswordVerifier passwordVerifier = new PasswordVerifier();
        String password = null;
        boolean checkFlag = false;

        while (!checkFlag) {
            System.out.print("Придумайте и введите пароль: ");
            String enterPass = scanner.nextLine();
            try {
                checkFlag = passwordVerifier.checkPassword(enterPass);
                password = enterPass;
                System.out.println("Пароль успешно создан.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Ваш пароль: " + password);
        scanner.close();
    }
}
