package baitapthuchanh02;

public class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) {
        super("Insufficient Funds!");
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
