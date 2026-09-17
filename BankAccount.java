class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount(String accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    BankAccount(String accountNumber, String accountHolder) {
        this(accountNumber,accountHolder,500);
    }
    BankAccount() {
        this("SBI0000", "Guest");
    }

    void display() {
        System.out.println(accountNumber+" "+ accountHolder+" "+balance);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount("SBI1234", "Benarji");
        BankAccount a3 = new BankAccount("SBI5678", "Rahul", 200);

        a1.display();
        a2.display();
        a3.display();
    }
}

