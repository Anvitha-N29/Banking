public abstract class Account {

    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(int accountNumber,
                   String accountHolder,
                   double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {

        balance += amount;

        System.out.println(amount + " deposited successfully.");
    }

    public abstract void withdraw(double amount);

    public void displayAccountDetails() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }
}