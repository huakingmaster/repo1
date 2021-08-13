package linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class Demo1 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("aaa");
        list.add("bbbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        list.addFirst("ssss");
        System.out.println(list);
        list.addLast("eeee");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
