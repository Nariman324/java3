// Throwable перехватывает два вида классов: исключения и ошибки(критические)
// От Exception наследуются все типы исключений.

public class Example04 {
    public static void main(String[] args) {
        int[] num1 = {4, 16, 32, 64, 128, 256, 512, 123};
        int[] num2 = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < num1.length; i++) {
            try {
                System.out.println(num1[i] + " / " + num2[i] + " = " + num1[i]/num2[i]);
            } catch (Exception exception) {
                System.out.println("Exception.");
            } 
        }
    }
}
