package co.epam.thread.deadLock;

public class MainDead {
    public static void main(String[] args) {
        MyThreadOne m1 = new MyThreadOne();
        MyThreadTwo m2 = new MyThreadTwo();

        m1.setThread1(m2);
        m2.setThread2(m1);

        m1.start();
        m2.start();
    }
}
