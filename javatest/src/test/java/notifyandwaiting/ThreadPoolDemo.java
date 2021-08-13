package notifyandwaiting;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService threadPool= Executors.newFixedThreadPool(3);
        Thread thread=new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+": 我开始执行了");
            }
        };
        threadPool.submit(thread);
        threadPool.submit(thread);
        threadPool.submit(thread);
        threadPool.submit(thread);
    }
}
