package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolParameter {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,
                10,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(20),new ThreadPoolExecutor.CallerRunsPolicy() );
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        for (int i = 0; i <1000 ; i++) {
            threadPoolExecutor.submit(r);
        }
    }
}
