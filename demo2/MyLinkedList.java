package stu10;
//单向不带头非循环链表
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;
    //1.头插法
    public void addFirst(int data){
        Node node=new Node(data);
        node.next=this.head;
        this.head=node;
    }
    //2.打印
    public void display(){
        Node cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //3.尾插
    public void addLast(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
        }else{
            Node cur=this.head;
            while(cur.next!=null){
               cur=cur.next;
            }
            cur.next=node;
        }
    }
    //4.任意位置插入,下标从0
    public void addIndex(int index,int data) {
        if(index<0||index>getLength()) {
            System.out.println("下标不合法");
            return;
        }
        if(index==0) {
            addFirst(data);
            return;
        }
        if(index==getLength()) {
            addLast(data);
            return;
        }
        Node node=new Node(data);
        Node cur=searchIndex(index);
        node.next=cur.next;
        cur.next=node;
    }
    public Node searchIndex(int index){
        Node cur=this.head;
        int count=0;
        while(count<index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }
    //5.求单链表长度
    public int getLength(){
        Node cur=this.head;
        int count=0;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //6.删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head==null){
            return;
        }
        if(this.head.data==key){
            this.head=this.head.next;
            return;
        }
        Node cur=searchNode(key);
        if(cur==null){
            System.out.println("没有此节点");
        }
        Node elem=cur.next;//要删的节点
        cur.next=elem.next;
    }
    public Node searchNode(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    //7.删除所有值为key的节点
    public void removeAll(int key) {
        if (this.head == null) {
            return;
        }
        Node pre = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if( cur.data!=key) {
                pre = cur;
                cur = cur.next;
            } else {
                pre.next = cur.next;
                cur = cur.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }
    //8.查找key是否在链表中
    public boolean contains(int key){
        Node cur = this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //9.清空链表
    public void clear(){
        this.head=null;
    }
}
