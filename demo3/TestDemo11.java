package study5;
//链表练习1.//反转单链表
public class TestDemo11 {
    public static void main(String[] args) {
        StudyLinkedList studyLinkedList=new StudyLinkedList();
        studyLinkedList.addFirst(11);
        studyLinkedList.addFirst(12);
        studyLinkedList.addFirst(13);
        studyLinkedList.addFirst(14);
        studyLinkedList.addFirst(15);//15,14,13,12,11
        studyLinkedList.display();
        Node newHead=studyLinkedList.reverseList();
        studyLinkedList.display2(newHead);
    }
}
