package datastructure.LinkedList;

public class SingleLinkedList {
    Node head = new Node(null);

    /**
     * 链表尾部插入
     *
     * @param data
     */
    public void addLast(int data) {
        Node temp = head;
        Node node = new Node(data);
        if (head.next == null) {
            head.next = node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    /**
     * 输出链表长度
     *
     * @return
     */
    public int length() {
        int length = 0;
        if (head.next == null) {
            return length;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }

   public  void printData(){
        if(length()==0){
            System.out.print("链表为空");
        }else {
            Node t=head;
            while (t.next!=null){
                System.out.print(t.next.data+" ");
                t=t.next;
            }
        }
   }

    /**
     * 在指定位置插入数据
     *
     * @param index 指定位置，从1开始
     * @param data  插入的数据
     * @return
     */
    public boolean insert(int index, int data) {
        Node node = new Node(data);
        if ((index < 1 || index > length())) {
            return false;
        } else {
            if (index == 1) {
                node.next = head.next;
                head.next = node;
                return true;
            } else {
                Node temp = head;
                for (int i = 1; i < index; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
            }
            return  true;
        }
    }


}
