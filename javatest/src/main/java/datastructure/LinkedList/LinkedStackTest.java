package datastructure.LinkedList;

import datastructure.LinkedStack;

public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack ls = new LinkedStack();
        int [] arr={4,5,6,4,2,7,1};
        for (int i = 0; i < arr.length; i++) {
            ls.push(arr[i]);
        }
        Integer data=0;
        while (data!=null){
            data=ls.pop();
           if (data!=null){
               System.out.print(data+", ");
           }
        }
    }
}
