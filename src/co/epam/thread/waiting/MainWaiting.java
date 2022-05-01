package co.epam.thread.waiting;

public class MainWaiting {
    public static void main(String[] args) {
        Product  p = new Product();
        Producer pr = new Producer(p,5);
        Consumer consumer = new Consumer(p,5);

        pr.start();
        consumer.start();
    }
}
