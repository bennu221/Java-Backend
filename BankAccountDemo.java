abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    abstract void withdraw(double amount);
    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Minimum balance 500 required!");
        }
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    void withdraw(double amount) {
        if (balance - amount >= -10000) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    double calculateInterest() {
        return 0;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount("SA101", 5000);
        CurrentAccount c = new CurrentAccount("CA201", 2000);

        s.deposit(1000);
        s.withdraw(3000);

        c.deposit(500);
        c.withdraw(7000);

        System.out.println("\nSavings Balance: " + s.balance);
        System.out.println("Savings Interest: " + s.calculateInterest());

        System.out.println("\nCurrent Balance: " + c.balance);
        System.out.println("Current Interest: " + c.calculateInterest());
    }
}