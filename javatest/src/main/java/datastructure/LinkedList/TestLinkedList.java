package datastructure.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        int [] arr1={1,4,8,6,12,5,4,7,2,3};
        SingleLinkedList sl=new SingleLinkedList();
        for (int i=0;i<arr1.length;i++){
            sl.addLast(arr1[i]);
        }
        System.out.println(sl.length());
       // System.out.println(sl.length()==arr1.length);
        sl.printData();
        System.out.println();
        sl.insert(5,66);
        sl.printData();
    }
}
