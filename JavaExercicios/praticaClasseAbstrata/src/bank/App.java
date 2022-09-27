package bank;

import bank.typeOfUsers.Basic;
import bank.typeOfUsers.Executive;
import bank.typeOfUsers.TicketCollector;

public class App {
    public static void main(String[] args) {
        System.out.println("--Executive--");
        Executive executive = new Executive();

        executive.doDeposit(200.00);
        executive.transacaoOk("Deposit");

        executive.doTransference(800.00);
        executive.transacaoNaoOk("Transference");

        System.out.println("--Cobrador--");
        TicketCollector ticketCollector = new TicketCollector();
        ticketCollector.withDraw(900.00);
        ticketCollector.transacaoOk("WithDraw");

        ticketCollector.showBalance();
        ticketCollector.transacaoNaoOk("Show Balance");

        System.out.println("--Basic--");
        Basic basic = new Basic();
        basic.doPayment("Netflix");

    }
}
