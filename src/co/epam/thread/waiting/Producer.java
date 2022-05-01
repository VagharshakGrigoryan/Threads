package co.epam.thread.waiting;

public class Producer extends Thread {

    Product p;
    int count;

    Producer(Product p, int count) {
        this.p = p;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i < count + 1; i++) {
            p.setProductId(i);
        }
    }
}
