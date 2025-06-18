package baitapthuchanh02;

public class CheckingAccount {
    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            double needs = amount - this.balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public int getNumber() {
        return this.number;
    }
}
