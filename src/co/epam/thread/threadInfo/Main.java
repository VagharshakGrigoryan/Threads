package co.epam.thread.threadInfo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = Thread.currentThread();
        System.out.println("Name of thread: " + myThread.getName());
        myThread.setName("MyThread");
        System.out.println("Name of thread: " + myThread.getName());
        System.out.println("Priority: " + myThread.getPriority());
        myThread.setPriority(10);
        System.out.println("Priority: " + myThread.getPriority());
        System.out.println("Is thread Alive : " + myThread.isAlive());

        new OtherThread().start();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            System.out.println("i = " + i);
        }
    }
}
