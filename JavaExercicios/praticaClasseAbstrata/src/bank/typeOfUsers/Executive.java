package bank.typeOfUsers;

import bank.transactions.Deposit;
import bank.transactions.Transference;

public class Executive implements Deposit, Transference {
    @Override
    public void doDeposit(double value) {
        System.out.println("Making a deposit of $: " + value);
    }

    @Override
    public void doTransference(double value) {
        System.out.println("Making a transference of $: " + value);
    }

    @Override
    public void transacaoOk(String typeTransaction) {
        System.out.println(typeTransaction + " realizado corretamente");
    }

    @Override
    public void transacaoNaoOk(String typeTransaction) {
        System.out.println(typeTransaction + " não pode ser executada");
    }
}
