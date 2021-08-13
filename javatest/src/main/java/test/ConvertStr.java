package test;

/**
 * 翻转字符串
 * 比如 "the sky is blue"
 * 翻转为"blue is sky the"
 */

import java.util.Stack;

public class ConvertStr {
    public static void main(String[] args) {
        String str = "the sky is blue";
        String[] s = str.split(" ");
        Stack stack = new Stack();
        for (int i = 0; i <s.length ; i++) {
            stack.push(s[i]);
        }
        StringBuilder str1=new StringBuilder();
        while (!stack.isEmpty()){
            str1.append(stack.pop()+" ");
        }
        System.out.println(str1);
    }
}
