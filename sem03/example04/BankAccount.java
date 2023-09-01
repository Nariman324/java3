package sem03.example04;

public class BankAccount {
    int accountNumber;
    int balance;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) throws InsufficientFundsException, NegativeAmountException{
        if (amount < 0) {
            throw new NegativeAmountException("Невозможно списать отрицательную сумму.");
        }
        if (amount > this.balance) {
            throw new InsufficientFundsException("Недостаточно средств для совершения операции.");
        }
        this.balance -= amount;
    }

    public void deposit(int amount) throws NegativeAmountException{
        if (amount < 0) {
            throw new NegativeAmountException("Невозможно списать отрицательную сумму.");
        }
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }
}
