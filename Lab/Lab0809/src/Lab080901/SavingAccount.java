package Lab080901;

public class SavingAccount extends Account {
    double rate;

    public SavingAccount() {}

    public SavingAccount(double initialize, double rate) {
        super(initialize);
        this.rate = rate;
    }

    public double getInterest() {
        return this.rate * super.getBalance() / 100;
    }
}
