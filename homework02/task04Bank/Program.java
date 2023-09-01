package homework02.task04Bank;

public class Program {
    public static void main(String[] args) {
        Bank myBank = new Bank("My Bank");

        myBank.openAccount("Maria", 50000);
        myBank.openAccount("Andrey", 100000);
        myBank.openAccount("Sergey", 55000);
        myBank.openAccount("Elena", 40000);

        myBank.withdraw(1000000001, 30000);
        myBank.printAccount(1000000001);

        myBank.withdraw(1000000001, 18001);
        myBank.printAccount(1000000001);

        myBank.withdraw(1000000002, 100);
        myBank.deposit(1000000002, 1);
        myBank.printAccount(1000000002);
    }

}
