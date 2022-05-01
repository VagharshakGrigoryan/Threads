package co.epam.thread.threadAndRunable;

public class OtherThread implements Runnable{
    @Override
    public  void run(){
        for (int j = 0; j < 5; j++) {
            try {
                Thread.sleep(2000);
                System.out.println("j = " + j + " " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
