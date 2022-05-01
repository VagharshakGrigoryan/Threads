package co.epam.thread.sinchro.sinchronization;

public class TicketSynchronization {

    boolean isBought;
    int place;


    public TicketSynchronization(int place) {
        this.place = place;
    }

    synchronized void buy(CashierSynchronization c){
        if (!isBought){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isBought=true;
            System.out.println("Cashier " + c.id + " Ticket " + this.place);
        }
    }
}
