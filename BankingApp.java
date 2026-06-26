public class BankingApp {

    public static void main(String[] args) {

        SavingsAccount acc =
                new SavingsAccount(
                        101,
                        "Anvita",
                        1000);

        acc.deposit(500);

        acc.withdraw(200);

        acc.displayAccountDetails();
    }
}