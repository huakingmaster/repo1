package test;

import java.util.TreeMap;

public class TaskAdd {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                int a=10;
                int b=20;
                System.out.println("a: "+a+", b:"+b);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                a++;
                b++;
                System.out.println("a: "+a+", b:"+b);
                }
            };
        for (int i = 0; i <100; i++) {
            new Thread(r).start();
        }
    }
}
