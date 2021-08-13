package set;

import java.util.*;

public class ComparateDemo {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        list.add(new Person(15,"张三"));
        list.add(new Person(118,"李四"));
        list.add(new Person(28,"李四"));
        Collections.sort(list);
        System.out.println(list);
    }

}
