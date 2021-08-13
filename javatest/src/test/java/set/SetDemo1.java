package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {

//        Set<Integer> set=new HashSet<Integer>();
//        set.add(1);
//        set.add(2);
//        set.add(4);
//        set.add(16);
//        for (Integer i:set){
//            System.out.println(i);
//        }
//        String str1="重地";
//        String str2="通话";
//        System.out.println(str1.hashCode()==str2.hashCode());
        HashSet<Person> set=new HashSet<>();
        set.add(new Person(12,"张三"));
        set.add(new Person(12,"李四 "));
        Iterator<Person> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
//
 }
}
