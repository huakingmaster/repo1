package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i <100 ; i++) {
            threadPool.submit(r);
        }
        threadPool.shutdown();
    }
}
