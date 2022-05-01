package co.epam.thread.runnable;

import co.epam.thread.threadInfo.Main;

public class MainRunnable implements Runnable {
    private final String word;
    private final int delay;

    private MainRunnable(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (; ; ) {
            System.out.print(word + " ");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MainRunnable ping = new MainRunnable("PING",33);
        MainRunnable pong = new MainRunnable("PONG",33);


        Thread t1 = new Thread(ping);
        Thread t2 = new Thread(pong);

        t1.start();
        t2.start();
    }
}

