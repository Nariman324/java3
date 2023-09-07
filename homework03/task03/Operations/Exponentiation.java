package homework03.task03.Operations;

public class Exponentiation extends MathOperations {

    public Exponentiation(int a, int b) {
        super(a, b);
        this.type = TypeOperation.ADD;
    }

    @Override
    public void operation() {
        if (this.b == 0) {
            this.result = 1;
        } else {
            this.result = 1;
            for (int i = 0; i < this.b; i++) {
                this.result *= a;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Тип: %s, %d ^ %d = %.0f", type, a, b, result);
    }
    
}
