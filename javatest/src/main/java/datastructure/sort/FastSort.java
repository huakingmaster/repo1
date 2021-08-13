package datastructure.sort;

import java.util.HashMap;
import java.util.Map;

public class FastSort {
    public static void main(String[] args) {
        //100以内被3整除
//        for (int i = 1; i<100/3; i++) {
//            if ((i*3<100)&&((i*3)%5==2)){
//                System.out.println(3*i);
//            }
//        }
        //2 3 7凑100
//        int count=0;
//        for (int i = 0; i < (100/7); i++) {
//            for (int j = 0; j <(100-7*i)/3 ; j++) {
//                if(((100-7*i-3*j)%2==0)&&((100-7*i-3*j)>0)){
//                    count++;
//            }
//            }
//        }
//        System.out.println("count->"+count);
//        ______________________________
        //查找数组种出现最多的元素
//        int [] a={1,2,3,4,5,5,6};
//        int val_max=0;
//        int val_time=0;
//        int time_temp=0;
//        for (int i = 0; i <a.length ; i++) {
//            time_temp=0;
//            for (int j = 0; j <a.length ; j++) {
//                if (a[i]==a[j]){
//                    time_temp++;
//                }
//            }
//            if(time_temp>val_time){
//                val_time=time_temp;
//                val_max=a[i];
//            }
//        }
//        System.out.println("出现次数最多的元素->"+val_max+", 次数："+val_time);
        //$##$$$$$##########################################
//        字典结构找最大次数的元素
//        int [] a={1,2,3,4,5,5,6};
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i <a.length ; i++) {
//            if (map.containsKey(a[i])){
//                map.put(a[i],map.get(a[i])+1);
//            }else{
//                map.put(a[i],1);
//            }
//        }
//        int temp_time=0;
//        int max_val=0;
//        for ( Integer key:map.keySet()
//             ) {
//            if (map.get(key)>temp_time){
//                temp_time=map.get(key);
//                max_val=key;
//            }
//        }
//        System.out.println("最多次数的是："+max_val+",出现的次数："+temp_time);


    }
}
