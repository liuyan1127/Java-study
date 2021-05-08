package study5;
//链表练习1.反转单链表
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class StudyLinkedList {
    public Node head;
    //头插,定义链表
    public void addFirst(int data){
        Node node=new Node(data);
        node.next=this.head;
        this.head=node;
    }
    //打印
    public void display(){
        Node cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public Node reverseList(){
        Node newHead=null;
        Node pre=null;
        Node cur=this.head;
        while(cur!=null){
            Node curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=pre;
            pre=cur;
            cur=curNext;
        }
        return newHead;
    }
    //打印链表
    public void display2(Node newHead){
        Node cur=newHead;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}
