package randomtest;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int a=random.nextInt();//整个int范围
        int b=random.nextInt(3);//左闭右开 0-2
        System.out.println(a);
        System.out.println(b);
    }
}
