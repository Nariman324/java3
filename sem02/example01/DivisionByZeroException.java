package sem02.example01;

// Класс исключения для деления на ноль DivisionByZeroException

class DivisionByZeroException extends Exception {

    public DivisionByZeroException(String message) {

        super(message);

    }
}