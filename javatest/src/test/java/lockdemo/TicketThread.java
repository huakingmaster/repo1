package lockdemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketThread implements Runnable {
    private int ticket=100;
   Lock lock=new ReentrantLock();
    @Override
    public void run() {
       while (true){
           lock.lock();
              if(ticket>0){
                  System.out.println("当前正在出售第"+ticket+"张票");
                  try {
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  ticket--;
          }
           lock.unlock();
       }

    }
}
