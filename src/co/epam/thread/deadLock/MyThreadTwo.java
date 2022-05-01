package co.epam.thread.deadLock;

public class MyThreadTwo extends Thread {

    private Thread t2;

    MyThreadTwo(){
        System.out.println("MyThreadTwo create");
    }

    public void setThread2(Thread t){
        this.t2=t;
    }

    @Override
    public void run() {
        System.out.println("MyThreadTwo start");

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("MyThread interrupt MyThreadOne finish....");

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadTwo finished");
    }
}