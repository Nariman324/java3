package sem02.example02;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            throwCheckedException();
        } catch (CustomCheckedException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        throwUncheckedException(); // Нет блока try-catch, так как unchecked

        System.out.println("This will still be executed.");
    }

    public static void throwCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException("This is a checked exception.");
    }

    public static void throwUncheckedException() {
        throw new CustomUncheckedException("This is an unchecked exception.");
    }
}
