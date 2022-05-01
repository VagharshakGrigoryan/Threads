package co.epam.thread.simple;

import java.util.ArrayList;

//public class SimpleThread extends Thread {
public class SimpleThread implements Runnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new SimpleThread());
        System.out.println(Thread.currentThread().getName());
        thread.start();

        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(new Object());
        }
        System.out.println("Hello");
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
