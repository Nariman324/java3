package homework03.task03.Operations;

public class Add extends MathOperations {

  public Add(int a, int b) {
    super(a, b);
    this.type = TypeOperation.ADD;
  }

  @Override
  public void operation() {
    this.result = this.a + this.b;
  }

  @Override
  public String toString() {
    return String.format("Тип: %s, %d + %d = %.0f", type, a, b, result);
  }

}
