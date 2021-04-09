package stu10;
//单向不带头非循环链表
public class TestDemo10 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
//        myLinkedList.addFirst(1);
//        myLinkedList.addFirst(2);
//        myLinkedList.addLast(45);
//        myLinkedList.addLast(17);
        myLinkedList.addIndex(0,13);
        myLinkedList.addIndex(1,10);
        myLinkedList.addIndex(2,12);
//        myLinkedList.display();
//        myLinkedList.remove(2);
//        myLinkedList.display();
//        myLinkedList.remove(17);
//        myLinkedList.display();
//        myLinkedList.remove(45);
        myLinkedList.display();
//        boolean ret=myLinkedList.contains(5);
//        System.out.println(ret);
        System.out.println("===============");
        //myLinkedList.removeAll(13);
        myLinkedList.clear();
        myLinkedList.display();
    }
}
