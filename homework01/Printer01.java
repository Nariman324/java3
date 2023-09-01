class Answer {
    public void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] arr = new int[]{1,2,3,4};
        System.out.println(arr[4]);
      
}

    public void divisionByZero() {
        // Напишите свое решение ниже
        System.out.println(12 / 0);
      
}

    public void numberFormatException() {
        // Напишите свое решение ниже
        String str = "la la la";
        int num = Integer.parseInt(str);
        System.out.println(num);
       
 }
}

public class Printer01 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}