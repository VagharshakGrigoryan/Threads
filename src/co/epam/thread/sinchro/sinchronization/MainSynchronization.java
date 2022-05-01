package co.epam.thread.sinchro.sinchronization;

public class MainSynchronization {
    public static void main(String[] args) {
        TicketSynchronization[] tickets = {
                new TicketSynchronization(10),
                new TicketSynchronization(20),
                new TicketSynchronization(30),
                new TicketSynchronization(40)};

        CashierSynchronization c1 = new CashierSynchronization(1, tickets);
        CashierSynchronization c2 = new CashierSynchronization(2, tickets);
        CashierSynchronization c3 = new CashierSynchronization(3, tickets);
        CashierSynchronization c4 = new CashierSynchronization(4, tickets);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }

}
