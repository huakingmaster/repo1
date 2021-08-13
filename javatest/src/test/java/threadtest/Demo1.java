package threadtest;

public class Demo1 {
    public static void main(String[] args) {
        Person p1=new Person("小明");
        Person p2=new Person("旺财");
//        p1.run();
//        p2.run();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                p1.run();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                p2.run();
            }
        });
        t1.start();
        t2.start();
    }

}
