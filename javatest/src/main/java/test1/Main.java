package test1;

import java.lang.Integer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
            list.add(new Integer(i + 1).toString());
        }
        Collections.sort(list, (x1, y1) -> {
            int len = 0;
            if (x1.length() > y1.length()) {
                len = y1.length();
            } else {
                len = x1.length();
            }
            for (int i = 0; i < len; i++) {
                if (x1.charAt(i) > y1.charAt(i)) {
                    return 1;
                }
                if (x1.charAt(i) < y1.charAt(i)) {
                    return -1;
                }
            }
            if (x1.length() < y1.length()) {
                return -1;
            } else {
                return 1;
            }
        });
        System.out.println(Integer.parseInt(list.get(m-1)));
    }

}