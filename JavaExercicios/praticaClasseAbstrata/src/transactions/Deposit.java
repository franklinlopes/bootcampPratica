package transactions;

public interface Deposit extends Transaction {
    public void doDeposit(double value);
}
