package test;

import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProductAndConsumer {
    public static void main(String[] args) {
        MyBlockingQueue blockingqueue = new MyBlockingQueue(10);
        new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <1000 ; i++) {
                        try {
                            if(i%2==0){
                                blockingqueue.put(i);
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    try {
                        if(i%2==1){
                            blockingqueue.put(i);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <500 ; i++) {
                    try {
                        System.out.println("消费者1："+blockingqueue.take());;
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                    }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <500 ; i++) {
                    try {
                        System.out.println("消费者2："+blockingqueue.take());;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }


}
