package bank.typeOfUsers;

import bank.transactions.ShowBalance;
import bank.transactions.WithDraw;

public class TicketCollector implements WithDraw, ShowBalance {
    @Override
    public void withDraw(double value) {
        System.out.println("$ withdrawal: " + value);
    }

    @Override
    public void showBalance() {
        System.out.println("Consulting balance...");
    }

    @Override
    public void transacaoOk(String typeTransaction) {
        System.out.println(typeTransaction + " realizada corretamente");
    }

    @Override
    public void transacaoNaoOk(String typeTransaction) {
        System.out.println(typeTransaction + " não pode ser executada");
    }
}
