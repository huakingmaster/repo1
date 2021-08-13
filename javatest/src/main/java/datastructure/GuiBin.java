package datastructure;


import java.util.Arrays;

public class GuiBin {
    public static void main(String[] args) {
        int [] a={49,38,65,97,76,13,27,50};
        int [] b=new int[a.length];
        System.out.println("原始数据"+ Arrays.toString(a));
        customMergeSort(a,b,0,a.length-1);
        System.out.println("归并排序："+Arrays.toString(a));
    }
    public static void customMergeSort(int[] a,int [] b,int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            //对左侧子序列进行递归排序
            customMergeSort(a,b,start,mid);
            //对右侧子序列进行递归排序
            customMergeSort(a,b,mid+1,end);
            //合并
            customDoubleMerge(a,b,start,mid,end);
        }
    }
    public static void customDoubleMerge(int [] a,int []b,int left,int mid,int right){
        int p1=left,p2=mid+1,k=left;
        while (p1<=mid&&p2<=right){
            if (a[p1]<=a[p2]){
                b[k++]=a[p1++];
            }else {
                b[k++]=a[p2++];
            }
        }
        while (p1<=mid){
            b[k++]=a[p1++];
        }
        while (p2<=right){
            b[k++]=a[p2++];
        }
//        复制回原数组
        for (int i =left; i < right; i++) {
            a[i]=b[i];
        }

    }
}
