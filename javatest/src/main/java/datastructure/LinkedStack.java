package datastructure;

import javax.print.DocFlavor;

/**
 * 链表实现栈
 */

 public class LinkedStack {
    Node top=null;
    class Node{
        Integer data;
        Node next;
        Node(Integer data){
            this.data=data;
        }
    }
    public void push(Integer data){
        Node node = new Node(data);
        if(top==null){
            top=node;
        }else {
            node.next=top;
            top=node;
        }
    }
    public Integer pop(){
       if (top!=null){
           int data=top.data;
           top=top.next;
           return data;
       }else {
           return null;

       }

    }
}

