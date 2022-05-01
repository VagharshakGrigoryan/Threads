package co.epam.thread.threadAndRunable;

public class MainRun {
    public static void main(String[] args) throws InterruptedException {
        Thread other = new Thread(new OtherThread());

        other.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000);
            System.out.println("i = " + i);
            if (i == 2) {
                System.out.println(Thread.currentThread().getName());
                other.join();
            }
        }
    }
}
