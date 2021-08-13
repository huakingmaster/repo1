package collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
        col.add("sda");
        col.add("saa");
        col.add("sbb");
        col.add("scc");
//        Iterator<String> iterator = col.iterator();
//       while ( iterator.hasNext()){
//           System.out.println(iterator.next());
//       }
       for(String i:col){
           System.out.println(i);
       }
    }


}
