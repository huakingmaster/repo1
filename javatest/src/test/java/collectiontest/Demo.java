package collectiontest;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        //创建集合对象，使用多态
        Collection<String> col=new ArrayList<>();
        System.out.println(col);//重写了toString方法[]
        boolean b = col.add("asdda");
        System.out.println(b);

        col.add("aa");
        col.add("sss");
        System.out.println(col);

        System.out.println( col.contains("aa"));
        col.remove("aa");
        System.out.println(col);



    }
}
