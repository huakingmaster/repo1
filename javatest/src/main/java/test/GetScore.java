package test;

/**
 * 去掉最高分和最低分，顺序保存，并计算平均分
 */
public class GetScore {
    public static void main(String[] args) {
        int[] arr={5,3,4,7,9};
        int max_val=0;
        int max_inx=-1;
        int min_val=99;
        int min_inx=-1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max_val){
                max_val=arr[i];
                max_inx=i;
            }
            if (arr[i]<min_val){
                min_val=arr[i];
                min_inx=i;
            }
        }
        int inx1=min_inx;
        int inx2=max_inx;
        if (min_inx>max_inx){
            inx1=max_inx;
            inx2=min_inx;
        }
        //元素迁移
        for (int i = inx2; i <arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        for (int i = inx1; i <arr.length-2; i++) {
            arr[i]=arr[i+1];
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        int score=0;
        for (int i = 0; i <arr.length-2 ; i++) {
            score+=arr[i];
        }
        System.out.println("分数："+score/3.0);
    }
}
