package datastructure.sort;

/**
 * 冒泡排序
 * 如果第一个比第二个大就交换他们的顺序
 * 时间复杂度O(n2)空间复杂度O(1)
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={9,8,7,6,5,4,3,2,1,1,15,45,1,2,1,34,5,8,7,7,6,0};
        sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ,");
        }
    }
    static void  sort(int [] arr){
        int len=arr.length;
        for (int i = len; i >=1; i--) {
            for (int j = 0; j <i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
}
