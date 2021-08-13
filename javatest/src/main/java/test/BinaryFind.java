package test;

import javax.swing.*;

//二分查找有序数组中的指定元素
public class BinaryFind {
    public static void main(String[] args) {

        int[] a = {1, 2, 5, 7, 8, 9, 11, 15, 18, 20, 25, 28};
//        int[] a={1,5};
//        int[] a={1,5,10};
        binaryFind(a, 4);
    }

    public static void binaryFind(int[] a, int target) {
                    int start=0;
                    int end=a.length-1;
                    while (start<= end){
                        if (a[start]==target){
                            System.out.println("找到目标值，下标是："+start);
                            return;
                        }
                        if (a[end]==target){
                            System.out.println("找到目标值，下标是："+end);
                            return;
                        }
                        int mid=(start+end)/2;
                        if (a[mid]==target){
                            System.out.println("找到目标值，下标是："+start);
                            return;
                        }else {
                            if (a[mid]>target){
                                end=mid-1;
                            }else {
                                start=mid+1;
                            }
                        }
                    }
        System.out.println("没找到");

    }
}
