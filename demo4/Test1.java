package study6;
//1.非空单链表，奇数返回中间节点，偶数返回第二个节点
//2.求单链表的倒数第k个节点
public class Test1 {
    public static void main(String[] args) {
        LinkedList1 linkedList1=new LinkedList1();
        linkedList1.addFirst(11);
        linkedList1.addFirst(14);
        linkedList1.addFirst(4);
        linkedList1.addFirst(12);
        linkedList1.addFirst(3);
        linkedList1.display();//3,12,4,14,11
        Node newNode=linkedList1.middleNode();
        System.out.println(newNode.data);
        Node newNode1=linkedList1.FindTail(5);
        System.out.println(newNode1.data);
    }
}
