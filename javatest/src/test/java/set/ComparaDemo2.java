package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparaDemo2 {
    public static void main(String[] args) {
        List<Stu> list=new ArrayList<>();
        list.add(new Stu("王五",16));
        list.add(new Stu("老王",56));
        list.add(new Stu("马六",26));
        Collections.sort(list, new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
                if(o1.getAge()!=o2.getAge()){
                    return o1.getAge()-o2.getAge();
                }else {
                    return o1.getName().compareTo(o2.getName());
                }

            }
        });
        System.out.println(list);
    }
}
