package test;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue {
    private int max=16;
    private Queue queue;
    private final ReentrantLock lock=new ReentrantLock();
     Condition consumer = lock.newCondition();
     Condition producter = lock.newCondition();

    public MyBlockingQueue(int size) {
        this.max=size;
        this.queue = new ArrayBlockingQueue(size);
    }
    public void put(Object o) throws InterruptedException{
        lock.lock();
        try {
            while (queue.size()==max){
                producter.await();
                }
              queue.add(o);
          consumer.signalAll();
            }  finally {
            lock.unlock();
            }
    }
    public Object take() throws InterruptedException{
            lock.lock();
          try {
              while (queue.size()==0){
                  consumer.await();
              }
              Object item=queue.remove();
              producter.signalAll();
              return item;
          }finally {
              lock.unlock();
          }
    }
}
