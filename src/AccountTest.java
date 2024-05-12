public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setName("John Doe");
        checkingAccount.setBalance(1000.0);

        checkingAccount.withdraw(500.0);
        checkingAccount.withdraw(700.0);
        checkingAccount.withdraw(-200.0);

        int term = 24;
        SavingsBond savingsBond = new SavingsBond(term);
        double interestRate = savingsBond.getInterestRate();
        System.out.println("Interest rate for term " + term + " months: " + (interestRate * 100) + "%");
    }
}
