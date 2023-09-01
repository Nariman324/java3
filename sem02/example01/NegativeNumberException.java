package sem02.example01;

// Класс исключения для отрицательных чисел

class NegativeNumberException extends Exception {

    public NegativeNumberException(String message) {
        
        super(message);
    }
}
