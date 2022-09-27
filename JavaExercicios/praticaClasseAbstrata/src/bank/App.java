package bank;

import bank.typeOfUsers.Executive;

public class App {
    public static void main(String[] args) {
        System.out.println("--Executive--");
        Executive executive = new Executive();

        executive.doDeposit(200.00);
        executive.transacaoOk("Deposit");

        executive.doTransference(800.00);
        executive.transacaoNaoOk("Transference");
    }
}
