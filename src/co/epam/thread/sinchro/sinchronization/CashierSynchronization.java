package co.epam.thread.sinchro.sinchronization;

public class CashierSynchronization extends Thread{
    int id;
    TicketSynchronization[] t;

    CashierSynchronization(int id, TicketSynchronization[] t) {
        this.id = id;
        this.t = t;
    }

    @Override
    public synchronized void run() {
        for (TicketSynchronization ticketSynchronization : t) {


//            if (!ticket.isBought) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                ticket.isBought = true;
//                System.out.println("Cashier " + id + " Ticket " + ticket.place);
//            }
            ticketSynchronization.buy(this);
        }
    }
}


