package ArrayListDeom;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> arr=new ArrayList<>();
        //向集合中添加数据
        System.out.println( arr.add("hello") );
        arr.add("world");
        arr.add("java");
        System.out.println(arr);
        arr.add(2,"11");
        System.out.println(arr);
        System.out.println( arr.remove(0));
        System.out.println(arr.size());
    }
}
