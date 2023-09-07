package homework03.task03.Operations;

public abstract class MathOperations {

    int a;
    int b;
    double result;
    TypeOperation type;

    public enum TypeOperation {
        ADD, SUBSTRACT, MULTIPLY, DIVIDE, EXPONENT
    }

    public MathOperations(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getResult() {
        return result;
    }

    public abstract void operation();

    @Override
    public abstract String toString();
    
}
