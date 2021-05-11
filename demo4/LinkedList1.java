package study6;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class LinkedList1 {
    public Node head;
    //头插,定义链表
    public void addFirst(int data){
        Node node=new Node(data);
        node.next=this.head;
        this.head=node;
    }
    //打印链表
    public void display(){
        Node cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public Node middleNode(){//1.中间节点；2倍的计算
        Node slow=this.head;
        Node fast=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    //求链表长度
    public int getLength(){
        Node cur=this.head;
        int count=0;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    public Node FindTail(int k){//2.倒数第k个节点
        /*if(k<=0||this.head==null){
            return null;
        }*/
        if(k<=0||k>getLength()){
            return null;
        }
        Node slow=this.head;
        Node fast=this.head;
        while(k-1>0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                System.out.println("k值过大");
                return null;
            }
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
