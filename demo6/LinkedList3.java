package study8;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class LinkedList3 {
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
    public boolean findPalindrome(){//1.
        if(this.head==null){
            return false;
        }
        if(this.head.next==null){
            return true;
        }
        //1.找中间节点
        Node slow=this.head;
        Node fast=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //2.反转一半链表
        Node cur=slow.next;
        while(cur!=null){
            Node curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }
        while(this.head!=slow){
            if(this.head.data!=slow.data){//奇数链表
                return false;
            }
            if(this.head.next == slow) {//偶数链表
                return true;
            }
            this.head=this.head.next;
            slow=slow.next;
        }
        return true;
    }

    public boolean hasCycle() {//2.
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if (slow==fast) {
                return true;
            }
        }
        return false;
    }
        /*Node fast=this.head;
        Node slow=this.head;
        while (fast!=null&&fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast) {
                break;
            }
        }
        //有2种情况
        if(fast==null || fast.next==null) {
            return false;
        }
        return true;
    }*/

    public Node findCycle() {//3.
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast) {
                break;
            }
        }
        //有2种情况
        if(fast==null || fast.next==null) {
            //没有环
            return null;
        }
        slow=this.head;
        while(slow!=fast) {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}

