package datastructure;

import java.util.Arrays;

public class ChaRuPaiXu {
    public static void main(String[] args) {
        int [] a={2,3,5,1,23,6,78,34};
        System.out.println(Arrays.toString(a));
        for (int i = 1; i <a.length ; i++) {
            int temp=a[i];
            for (int j = i-1; j >=0 ; j--) {
                if (temp<a[j]){
                    a[j+1]=a[j];
                    a[j]=temp;
                }else {
                    break;
                }
            }
        }
        System.out.println("插入排序："+Arrays.toString(a));
    }
}
