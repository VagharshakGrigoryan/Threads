package co.epam.thread.sinchro.withoutSyncronization;

public class MainWithoutSynchronization {
    public static void main(String[] args) {
        Ticket[] tickets = {
                new Ticket(10),
                new Ticket(20),
                new Ticket(30),
                new Ticket(40)};

        Cashier c1 = new Cashier(1,tickets);
        Cashier c2 = new Cashier(2,tickets);
        Cashier c3 = new Cashier(3,tickets);
        Cashier c4 = new Cashier(4,tickets);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
