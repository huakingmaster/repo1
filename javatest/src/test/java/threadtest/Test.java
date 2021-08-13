package threadtest;

import static java.lang.Thread.*;

public class Test {
    public static void main(String[] args) {

//        ThreadDemo1 t1 = new ThreadDemo1();
//        t1.start();
////        Thread thread = t1.currentThread();
////        System.out.println(thread.getName());
//        for (int i=0;i<20;i++){
//            System.out.println(i);
//        }
        for (int i=0;i<20;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);

        }
    }
}
