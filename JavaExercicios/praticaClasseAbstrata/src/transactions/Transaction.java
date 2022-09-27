package transactions;

public interface Transaction {
    public abstract void transacaoOk(String typeTransaction);
    public abstract void transacaoNaoOk(String typeTransaction);
}
