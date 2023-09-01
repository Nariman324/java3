// пример показывает, что при обработке исключения с помощью блока try-catch, программа продолжает свою работу.
// также мы видим, что можно обработать конкретный тип ошибки - он же класс

public class Example01 {
    public static void main(String[] args) {
        int[] num = new int[4];
        try {
            System.out.println("Before exception.");
            num[7] = 10;
            System.out.println("After exception.");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Index is out of bounds");
        }
        System.out.println("After the catch.");
    }
}
