package test;

import java.util.LinkedList;

public class TraverseBTree {
    public static void main(String[] args) {
        Node node1 = new Node('A');
        Node node2 = new Node('B');
        Node node3 = new Node('C');
        Node node4 = new Node('D');
        Node node5 = new Node('E');
        Node node6 = new Node('F');
        Node node7 = new Node('G');
       node1.l=node2;
       node1.r=node3;
       node2.l=node4;
       node2.r=node5;
       node3.l=node6;
       node3.r=node7;
       node6.l=null;
       node6.r=null;
        node7.l=null;
        node7.r=null;
        System.out.println("前序遍历：");
        preordertrasver(node1);
        System.out.println();
        System.out.println("中序遍历：");
        inordertrasver(node1);
        System.out.println();
        System.out.println("后序遍历：");
        postordertrasver(node1);
        System.out.println();
        System.out.println("层级遍历：");
        leveltraverse(node1);
    }
    public static void preordertrasver( Node node){
        if (node==null){
            return;
        }
        System.out.print(node.data+" ");
        preordertrasver(node.l);
        preordertrasver(node.r);
    }
    public static void inordertrasver( Node node){
        if (node==null){
            return;
        }
        inordertrasver(node.l);
        System.out.print(node.data+" ");
        inordertrasver(node.r);
    }
    public static void postordertrasver( Node node){
        if (node==null){
            return;
        }
        postordertrasver(node.l);
        postordertrasver(node.r);
        System.out.print(node.data+" ");
    }
    public  static  void leveltraverse(Node root){
        if (root==null){
            return;
        }
        LinkedList<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node currnode=q.poll();
            System.out.print(currnode.data+" ");
            if (currnode.l!=null){
                q.offer(currnode.l);
            }
            if (currnode.r!=null){
                q.offer(currnode.r);
            }

        }


    }
    static class Node{
        char data;
        Node l;
        Node r;

        public Node(char data) {
            this.data = data;
        }
    }
}
