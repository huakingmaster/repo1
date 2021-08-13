package datastructure.sort;

/**
 * 选择排序，每次遍历找到 最大或者最小值放在数组前面或者后面
 * 时间复杂度O(n2) 空间复杂度O(1),不稳定
 */
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={9,8,7,6,5,4,3,2,1,1,0};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ,");
        };
    }
    static void sort(int [] arr){

        for (int i = 0; i <arr.length ; i++) {
           int  min=arr[i];
           int index;
            for (int j = i; j <arr.length ; j++) {
                if (arr[j]<min){
                    min=arr[j];
                    index=j;
                }
                int temp=arr[i];
                arr[i]=min;
                arr[j]=temp;
            }
        }
    }

}
