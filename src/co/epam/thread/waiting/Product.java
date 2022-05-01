package co.epam.thread.waiting;

public class Product {

    int id;
    boolean isProduced;

    synchronized void getIdProduct() {
        if (!isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" \t Get " + this.id);
        isProduced = false;
        notify();
    }

    synchronized void setProductId(int id) {
        if (isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.id = id;
        System.out.println("Set " + this.id);
        isProduced = true;
        notify();
    }
}
