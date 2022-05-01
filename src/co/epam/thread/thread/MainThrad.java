package co.epam.thread.thread;

import co.epam.thread.runnable.MainRunnable;

public class MainThrad  extends Thread{
    private final String word;
    private final int delay;

    private MainThrad(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (; ; ) {
            System.out.print(word + " ");
            try {
                sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MainThrad ping = new MainThrad("PING",33);
        MainThrad pong = new MainThrad("PONG",100);

        ping.start();
        pong.start();
    }
}
