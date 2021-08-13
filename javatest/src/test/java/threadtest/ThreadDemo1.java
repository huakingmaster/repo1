package threadtest;

public class ThreadDemo1 extends Thread{
    private String  name;

    @Override
    public void run() {
        System.out.println(getName());
    }
}
