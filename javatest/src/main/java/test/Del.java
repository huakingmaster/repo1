package test;

/**
 * 数组去重并返回新数组的长度
 */
public class Del {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        int[] arr={1,2,1,4,4,8,9,5,1,15,4,1,4,2};
        int count=0;
        int len=arr.length;
        for (int i = 0; i <len ; i++) {
            int first=arr[i];
            int inx=-1;
            for (int j = i+1; j <len ; j++) {
                if (first==arr[j]){
                    inx=j;
                    len--;
                    move(arr,inx);
                    j--;
                    count++;
                }
            }
        }
        for (int i = 0; i <arr.length-count ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("运行时间："+(System.currentTimeMillis()-l)+"ms");
    }
    public static void move(int [] arr,int inx){
        for (int i = inx; i <arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
    }
}
