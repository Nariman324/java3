package homework03.task03.Operations;

public class Divide extends MathOperations {

    public Divide(int a, int b) {
        super(a, b);
        this.type = TypeOperation.DIVIDE;
    }

    @Override
    public void operation() throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        this.result = this.a / this.b;
    }

    @Override
    public String toString() {
      return String.format("Тип: %s, %d / %d = %.2f", type, a, b, result);
    }

}
