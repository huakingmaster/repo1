package test;

import java.util.Arrays;
import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int zushu=Integer.parseInt(s);
        s = scanner.nextLine();
        int size=Integer.parseInt(s);
        //获取第1组数组的第一个数组
        s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int [] arr11=new int[size];
        for (int i = 0; i <size ; i++) {
                arr11[i]=Integer.parseInt(s1[i]);
        }
        //获取第1组数组的第2个数组
        s = scanner.nextLine();
        String[] s2 = s.split(" ");
        int [] arr12=new int[s1.length];
        for (int i = 0; i <s1.length ; i++) {
            arr12[i]=Integer.parseInt(s2[i]);
        }
        //获取第2组数组的第1个数组
        s = scanner.nextLine();
        String[] s3 = s.split(" ");
        int [] arr21=new int[size];
        for (int i = 0; i <size ; i++) {
            arr21[i]=Integer.parseInt(s3[i]);
        }
        //获取第2组数组的第2个数组
        s = scanner.nextLine();
        String[] s4= s.split(" ");
        int [] arr22=new int[size];
        for (int i = 0; i <size ; i++) {
            arr22[i]=Integer.parseInt(s4[i]);
        }
        for (int i = 0; i <size ; i++) {
            System.out.print(arr11[i]+" ");
            System.out.print(arr12[i]+" ");
            System.out.print(arr21[i]+" ");
            System.out.print(arr22[i]+" ");
            System.out.print("**");
        }
    }
}
