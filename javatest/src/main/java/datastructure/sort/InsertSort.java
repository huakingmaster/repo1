package datastructure.sort;

/**
 * 直接插入排序稳定
 * 时间复杂度O(n2)
 * 空间复杂度O(1)
 */
public class InsertSort {
    public static void main(String[] args) {
        int [] arr={9,8,7,6,5,4,3,2,1,1,0};
        sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ,");
        }

    }
    public static void sort(int [] arr){
        for (int i = 1; i <arr.length ; i++) {
             int j=i-1;
             int t;
          while (j>=0){
              if (arr[j]>arr[j+1]){
                  t=arr[j+1];
                  arr[j+1]=arr[j];
                  arr[j]=t;
                  j--;
              }else {
                break;
              }
          }
        }

    }
}
