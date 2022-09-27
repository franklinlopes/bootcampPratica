package transactions;

public interface Deposit extends Transaction {
    public abstract void doDeposit(double value);
}
