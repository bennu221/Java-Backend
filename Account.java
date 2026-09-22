public class Account {

    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount("ACC101", 5000, 5.5);

        s.display();

        s.withdraw(2000);
        s.display();

        s.withdraw(2600);
        s.display();
    }
}

class SavingsAccount extends Account {

    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void withdraw(double amount) {

        if (balance - amount < 500) {
            System.out.println("Minimum balance required!");
        } else {
            super.withdraw(amount);
        }
    }
}