public class SavingsBond {
    private int term;
    private double interestRate;

    public SavingsBond(int term) {
        this.term = term;
        setInterestRate();
    }

    public int getTerm() {
        return term;
    }

    public double getInterestRate() {
        return interestRate;
    }

    private void setInterestRate() {
        if (term >= 0 && term <= 11) {
            interestRate = 0.005; // 0.5%
        } else if (term >= 12 && term <= 23) {
            interestRate = 0.01; // 1.0%
        } else if (term >= 24 && term <= 35) {
            interestRate = 0.015; // 1.5%
        } else if (term >= 36 && term <= 47) {
            interestRate = 0.02; // 2.0%
        } else if (term >= 48 && term <= 60) {
            interestRate = 0.025; // 2.5%
        } else {
            System.out.println("Invalid term. Please enter a term between 1 and 60 months.");
        }
    }
}
