/*
 * Задача 2: Файловый менеджер (ООП, исключения)
Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций с файлами:
- чтение, 
- запись,
- копирование.
Каждый из этих методов должен выбрасывать соответствующее исключение, если в процессе выполнения операции произошла ошибка
(например, FileNotFoundException, если файл не найден).
*/

package homework03.task02;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Filemanager filemanager = new Filemanager();
        String action = "";
        while (!action.equals("exit")) {
            System.out.print(
                    "\nВыберите действие:\n [read] прочитать данные из файла\n [write] записать данные в файл\n [copy] скопировать файл\n [exit] завершить работу\n выбор: ");
            action = scanner.nextLine();
            switch (action) {
                case "read":
                    try {
                        String path = "D:\\StudyProjects\\MyGBProjects\\Exceptions\\homework03\\task02\\poem.tt";
                        StringBuilder fromFile = filemanager.readFile(path);
                        System.out.println("Файл успешно прочитан.");
                        System.out.println(fromFile);
                    } catch (IOException e) {
                        System.out.println("Произошла ошибка: " + e.getMessage());
                        System.out.println(e.getClass());
                    }
                    break;
                case "write":
                    try {
                        String path = "poem.txt";
                        String text = "New text";
                        filemanager.writeFIle(path, text);
                        System.out.println("Файл успешно создан.");
                    } catch (IOException e) {
                        System.out.println("Произошла ошибка: " + e.getMessage());
                        System.out.println(e.getClass());
                    }
                    break;
                case "copy":
                    try {
                        String path = "D:\\StudyProjects\\MyGBProjects\\Exceptions\\homework03\\task02\\poem.txt";
                        filemanager.copyFile(path, "newPoem");
                        System.out.println("Файл успешно скопирован.");
                    } catch (IOException e) {
                        System.out.println("Произошла ошибка: " + e.getMessage());
                        System.out.println(e.getClass());
                    }
                    break;
                case "exit":
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Такой команды нет.");
                    break;
            }
        }
        scanner.close();
    }
}
