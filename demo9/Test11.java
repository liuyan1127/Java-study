package study11;
//无头双向链表
public class Test11 {
    public static void main(String[] args) {
        RealLinkedList realLinkedList=new RealLinkedList();
        realLinkedList.addFirst(12);
        realLinkedList.addFirst(13);
        realLinkedList.addLast(11);
        realLinkedList.addLast(12);
        realLinkedList.addFirst(12);
        //realLinkedList.display();
        realLinkedList.addIndex(2,888);
        realLinkedList.display();
//        boolean ret=realLinkedList.contains(12);
//        System.out.println(ret);
        //realLinkedList.remove(888);
        realLinkedList.removeAllKey(12);
        realLinkedList.display();
        realLinkedList.clear();
        System.out.println("===========");
        realLinkedList.addFirst(1);
        realLinkedList.display();
    }
}
