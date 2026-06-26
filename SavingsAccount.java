public class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber,
                          String accountHolder,
                          double balance) {

        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println(amount + " withdrawn successfully.");
        }
        else {

            System.out.println("Insufficient Balance");
        }
    }
}