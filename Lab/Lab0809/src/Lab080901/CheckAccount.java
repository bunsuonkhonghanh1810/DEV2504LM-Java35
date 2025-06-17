package Lab080901;

public class CheckAccount extends Account {
    double feeTransfer;

    public CheckAccount() {}

    public CheckAccount(double balance, double feeTransfer) {
        super(balance);
        this.feeTransfer = feeTransfer;
    }

    @Override
    public void deposit(double amount) {
        balance += (amount - feeTransfer);
    }

    @Override
    public void withdraw(double amount) {
        balance -= (amount + feeTransfer);
    }
}
