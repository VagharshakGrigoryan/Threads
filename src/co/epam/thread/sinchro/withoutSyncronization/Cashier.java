package co.epam.thread.sinchro.withoutSyncronization;

public class Cashier extends Thread {
    int id;
    Ticket[] t;

    Cashier(int id, Ticket[] t) {
        this.id = id;
        this.t = t;
    }

    @Override
    public void run() {
        for (Ticket ticket : t) {
            if (!ticket.isBought) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket.isBought = true;
                System.out.println("Cashier " + id + " Ticket " + ticket.place);
            }
        }
    }
}
