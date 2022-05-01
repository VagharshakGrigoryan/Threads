package co.epam.thread.threadInfo;

public class OtherThread extends Thread{
    public  void run(){
        for (int j = 0; j < 10; j++) {
            try {
                Thread.sleep(2000);
                System.out.println("j = " + j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
