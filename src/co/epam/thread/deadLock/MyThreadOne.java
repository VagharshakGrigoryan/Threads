package co.epam.thread.deadLock;

public class MyThreadOne extends Thread{

    private Thread t1;

    MyThreadOne(){
        System.out.println("MyThreadOne create");
    }

    public void setThread1(Thread t){
        this.t1=t;
    }

    @Override
    public void run() {
        System.out.println("MyThreadOne start");

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("MyThread interrupt MyThreadTwo finish....");

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadOne finished");
    }
}
