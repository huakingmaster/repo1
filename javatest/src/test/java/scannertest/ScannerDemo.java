package scannertest;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字a：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数字b：");
        int b=sc.nextInt();
        System.out.println("结果是："+(a+b));
    }
}
