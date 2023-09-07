/*
 * Создайте класс MiniCalculator, который поддерживает следующие операции:
Сложение
Вычитание
Умножение
Деление
Возведение в степень
Операции должны выполняться с использованием ООП принципов (например, каждая операция может быть отдельным классом).
Класс должен поддерживать историю операций, которая хранится в коллекции.
Класс также должен выбрасывать исключения при недопустимых операциях (например, деление на ноль).
*/

package homework03.task03;

import java.util.Stack;

import homework03.task03.Operations.MathOperations;

public class MiniCalculator {

    Stack<MathOperations> operations = new Stack<>();

    public void newOperation(MathOperations mathOperation) {
        mathOperation.operation();
        operations.push(mathOperation);
    }

    public void printAllOperations() {
        for (MathOperations mathOperation : operations) {
            System.out.println(mathOperation);
        }
    }

}
