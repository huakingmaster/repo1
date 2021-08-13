package datastructure.array;

import java.util.Arrays;

public class ConvertArray {
    public static void main(String[] args) {
        int [] arr={1,5,4,6,8,7,5,10};
        System.out.println(Arrays.toString(arr));
        convert(arr);
        System.out.println(Arrays.toString(arr));


    }
    //把数组颠倒
    public static void convert(int [] arr){
        int temp;
        int i=0;
        int j=arr.length-1;
        while (i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
