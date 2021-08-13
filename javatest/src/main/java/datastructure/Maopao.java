package datastructure;

import java.util.Arrays;

/**
 * 冒泡排序时间复杂度为O(n2)
 * 空间复杂度为O(1)
 */
public class Maopao {
    public static void main(String[] args) {
        int [] a={1,0,3,4,5,-6,7,8,9,10};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length-1 ; j++) {
                if (a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
