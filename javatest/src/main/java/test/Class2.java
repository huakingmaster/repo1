package test;

import java.util.LinkedList;

/**
 * 解决约瑟夫环问题
 * n个人第m个人出列
 */
public class Class2 {
    public static void main(String[] args) {
    ring(10,5);

    }
    public static void ring(int n,int m){
        LinkedList<Integer> list = new LinkedList<>();
        //完成初始化入队
        for (int i = 1; i <=n ; i++) {
            list.add(i);
        }
        int i=1;
        while (!list.isEmpty()){
            if(i!=m){
                Integer element = list.poll();
                list.add(element);
                i++;
            }else {
                System.out.print(list.poll()+" ");
                i=1;
            }

        }

    }
}
