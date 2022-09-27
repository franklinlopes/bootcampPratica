package transactions;

public interface Transference extends Transaction {
    public abstract void doTransference(double value);
}
