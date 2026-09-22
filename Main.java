class BankAccount {
 
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("balance is not allowed.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountNumber("SBIN0001234");
        account.setBalance(5000);
    
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}