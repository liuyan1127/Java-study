package study9;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class LinkedList4 {
    public Node head;

    //头插,定义链表
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
    }

    //打印链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void display2(Node newHead){
        Node cur=newHead;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}