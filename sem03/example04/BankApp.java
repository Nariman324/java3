/*
 * Задача: Управление банковскими счетами
Вы разрабатываете программу для управления банковскими счетами.
Вам нужно реализовать классы для создания счетов, пополнения, снятия денег и вывода информации о балансе.
Также нужно предусмотреть обработку различных исключительных ситуаций.
Создание собственных исключений InsufficientFundsException и NegativeAmountException.
Обработка исключений при работе с методами deposit и withdraw класса BankAccount.
*/

package sem03.example04;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account01 = new BankAccount(1234);
        BankAccount account02 = new BankAccount(2234);
        
        try {
            account01.deposit(100);
            System.out.println(account01);
            account01.withdraw(50);
            System.out.println(account01);
            account01.deposit(-30);
            System.out.println(account01);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account02.deposit(100);
            System.out.println(account01);
            account02.withdraw(50);
            System.out.println(account01);
            account02.withdraw(100);
            System.out.println(account01);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
