package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class DIGUI {

    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>();
        Collections.addAll(strs,"1","2","3","4","5","6","7","8","9","10","11","12");
        strs.sort(new Comparator<String>() {
            @Override
            public int compare(String x1, String y1) {

                int len=0;
                if(x1.length()>y1.length()){
                    len=y1.length();
                }else {
                    len=x1.length();
                }
                for (int i = 0; i <len ; i++) {
                    if (x1.charAt(i)>y1.charAt(i)){
                        return 1;
                    }
                    if (x1.charAt(i)<y1.charAt(i)){
                        return -1;
                    }
                }
                if(x1.length()<y1.length()){
                    return -1;
                }else {
                    return 1;
                }
            }
        });
        Iterator<String> iterator = strs.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }

}
