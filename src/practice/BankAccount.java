package practice;

public class BankAccount implements Comparable {
    private double balance;

    public BankAccount() {
        this(0);
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "[BankAccount] balance = "+balance;
    }

    @Override
    public int compareTo(Object other) {
        BankAccount otherAct = (BankAccount) other;
        if (this.balance < otherAct.balance)
            return -1;
        if (this.balance > otherAct.balance)
            return 1;
        return 0;
    }
}
