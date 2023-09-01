package homework02.task04Bank;

public class BankAccount {

    static int counter = 1000000000;
    int accountNumber;
    int balance;
    int maxBalance;
    String owner;
    Status status;

    private enum Status {
        OPENED, CLOSED
    };

    {
        counter++;
    }

    public BankAccount(String owner, int maxBalance) {
        accountNumber = counter;
        balance = 0;
        this.status = Status.OPENED;
        this.owner = owner;
        this.maxBalance = maxBalance;
    }

    public void credit(int amount) {
        this.balance = this.balance + amount;
    }

    public void debit(int amount) {
        this.balance = this.balance - amount;
    }

    public void close() {
        this.status = Status.CLOSED;
    }

    public boolean isOpen() {
        if (this.status == Status.OPENED) return true;
        else return false;
    }

    @Override
    public String toString() {
        return String.format("Номер счета: %d\nВладелец счета: %s\nМаксимальный баланс: %d\nТекущий баланс счета: %d\nСтатус счета: %s\n", 
        this.accountNumber, this.owner, this.maxBalance, this.balance, this.status);

    }

}
