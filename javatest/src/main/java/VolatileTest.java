public class VolatileTest {
    volatile  int i;
    public static void main(String[] args) {
        VolatileTest v = new VolatileTest();

        new Thread(new Runnable() {
            @Override
            public void run() {
                long time = System.currentTimeMillis();
                for (int i = 0; i <1000 ; i++) {
                    try {
                        Thread.sleep(10);
                        v.add();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
             time = System.currentTimeMillis() - time;
                System.out.println(time);
            }
        }).start();
        try {
            Thread.sleep(15000);
            System.out.println(v.i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void add(){
        i++;
    }
}
