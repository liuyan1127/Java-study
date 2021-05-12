package study7;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class LinkedList2 {
    public Node head;
    //尾插
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
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
    public Node dividedLinked(int x) {//1.
        Node bs = null;//小
        Node be = null;

        Node as = null;//大
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if (cur.data < x) {
                if(bs==null){
                    bs=cur;
                    be=bs;
            } else {
                    be.next=cur;
                    be=cur;
                }
            }else{
                if(as==null){
                    as=cur;
                    ae=as;
                }else{
                    ae.next=cur;
                    ae=cur;
                }
            }
            cur = cur.next;
        }
        if(bs==null){
            return as;
        }
        be.next=as;
        if(as!=null){
            ae.next=null;
        }
        return bs;
    }
    //传节点打印
    public void display2(Node newHead){
        Node cur=newHead;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    public Node deleteDouble(){//2.
        Node newNode=new Node(-1);
        Node tmp=newNode;
        Node cur=this.head;
        while(cur!=null){
            if(cur.next!=null&&cur.data==cur.next.data){
                while(cur.next!=null&&cur.data==cur.next.data){
                    cur=cur.next;
                }
                cur=cur.next;
            }else{
                tmp.next=cur;
                tmp=cur;
                cur=cur.next;
            }
        }
        tmp.next=null;//
        return newNode.next;
    }
}
