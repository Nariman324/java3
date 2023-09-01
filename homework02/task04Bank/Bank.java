package homework02.task04Bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    Map<Integer, BankAccount> accounts = new HashMap<>();
    String name;

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(String owner, int maxBalance) {
        BankAccount account = new BankAccount(owner, maxBalance);
        System.out.printf("Счет %d успешно открыт.\nИмя владельца: %s\nМаксимальный баланс: %d\n\n",
                account.accountNumber,
                account.owner, account.maxBalance);
        accounts.put(account.accountNumber, account);
    }

    public void closeAccount(int accountNumber) {
        BankAccount currentAccount = accounts.get(accountNumber);
        if (!currentAccount.isOpen()) {
            System.out.println("Невозможно пополнить закрытый счет.");
        } else {
            if (currentAccount.balance > 0) {
                deposit(currentAccount.accountNumber, currentAccount.balance);
            }
            currentAccount.close();
            System.out.printf("Счет %d успешно закрыт.\n", currentAccount.accountNumber);
        }
    }

    public void withdraw(int accountNumber, int amount) {
        try {
            BankAccount currentAccount = accounts.get(accountNumber);
            if (!currentAccount.isOpen()) {
                System.out.println("Невозможно пополнить закрытый счет.");
            } else {
                if ((currentAccount.balance + amount) > currentAccount.maxBalance) {
                    throw new MaxBalanceExceededException("Операция не выполнена. Превышен максимальный баланс.");
                }
                currentAccount.credit(amount);
            }
        } catch (MaxBalanceExceededException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public void deposit(int accountNumber, int amount) {
        try {
            BankAccount currentAccount = accounts.get(accountNumber);
            if (!currentAccount.isOpen()) {
                System.out.println("Невозможно пополнить закрытый счет.");
            } else {
                if ((currentAccount.balance - amount) < 0) {
                    throw new InsufficientFundsException("Операция не выполнена. Недостаточно денежных средств.");
                }
            }
            currentAccount.debit(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public String getName() {
        return this.name;
    }

    public void printAllAccount() {
        for (var account : accounts.entrySet()) {
            System.out.println(account.getValue());
        }
    }

    public void printAccount(int accountNumber) {
        System.out.println(accounts.get(accountNumber));
    }
}
