package bank.typeOfUsers;

import bank.transactions.PaymentOfServices;
import bank.transactions.ShowBalance;
import bank.transactions.WithDraw;

public class Basic implements WithDraw, PaymentOfServices, ShowBalance {
    @Override
    public void showBalance() {
        System.out.println("Consulting balance...");
    }

    @Override
    public void doPayment(String typeService) {
        System.out.println("Paying service: " + typeService);
    }

    @Override
    public void withDraw(double value) {
        System.out.println("$ withdrawal: " + value);
    }

    @Override
    public void transacaoOk(String typeTransaction) {
        System.out.println(typeTransaction + " realizada corretamente");
    }

    @Override
    public void transacaoNaoOk(String typeTransaction) {
        System.out.println("A transação " + typeTransaction + " não pode ser executada");
    }
}
