public class Example03 {
    public static void main(String[] args) {
        int[] num1 = {4, 16, 32, 64, 128, 256, 512, 123};
        int[] num2 = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < num1.length; i++) {
            try {
                System.out.println(num1[i] + " / " + num2[i] + " = " + num1[i]/num2[i]);
            } catch (ArithmeticException exception) {
                System.out.println("Попытка деления на 0.");
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Элемент не найден");
            }
        }
    }
}
