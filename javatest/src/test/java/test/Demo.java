package test;

import java.util.Arrays;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
     String str="ss95131adsfjigjefewqgq";
     //升序排列
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String str1=new String(chars);
        System.out.println(str1);
        //倒序遍历
        for (int i = str1.length()-1; i >=0 ; i--) {
            System.out.print(str1.charAt(i));
        }
    }
}
