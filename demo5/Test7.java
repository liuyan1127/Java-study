package study7;
//1.给定一个值将链表分为两部分，小前大后
//2.在排序链表中，删除重复的节点，返回头结点
public class Test7 {
    public static void main(String[] args) {
        LinkedList2 linkedList2=new LinkedList2();
        linkedList2.addLast(11);
        linkedList2.addLast(11);
        linkedList2.addLast(12);
        linkedList2.addLast(13);
        linkedList2.addLast(23);
        linkedList2.addLast(23);
        linkedList2.display();
        Node newNode=linkedList2.dividedLinked(13);
        linkedList2.display2(newNode);
        Node newNode1=linkedList2.deleteDouble();
        linkedList2.display2(newNode1);
    }
}
