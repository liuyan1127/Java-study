package study9;
//1.找出两个链表的第一个相交点(相交，指向相同）
//2.将两个有序链表合并为一个新的有序链表
public class Test9 {
    public static  Node getIntersect(Node headA,Node headB){//1.相交点
        if(headA==null||headB==null){
            return null;
        }
        int lenA=0;
        int lenB=0;

        Node pl=headA;
        Node ps=headB;
        while(pl!=null){
            lenA++;
            pl=pl.next;
        }
        while(ps!=null){
            lenB++;
            ps=ps.next;
        }
        pl=headA;
        ps=headB;
        int len=lenA-lenB;
        if(len<0){
            ps=headA;//短
            pl=headB;//长
            len=lenB-lenA;
        }
        while(len>0){
            len--;
            pl=pl.next;
        }
        while(pl!=null&&ps!=null&&pl!=ps){
            pl=pl.next;
            ps=ps.next;
        }
        if(pl==ps&&pl!=null){
            return pl;
        }
        return null;
    }
    public static void createCut(Node headA, Node headB) {
        headA.next = headB.next.next;
    }

    public static Node uniteLinked(Node headA, Node headB){//2.合并
        Node newHead=new Node(-1);
        Node tmp=newHead;
        while (headA!=null&&headB!=null) {
            if(headA.data<headB.data) {
                tmp.next=headA;
                tmp=tmp.next;
                headA=headA.next;
            }else {
                tmp.next=headB;
                tmp=tmp.next;
                headB=headB.next;
            }
        }
        //headA != null && headB != null
        if(headA != null) {
            //headA剩下的所有数据，都是比headB里面的数据大的
            tmp.next = headA;
        }
        if(headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        LinkedList4 linkedList4=new LinkedList4();
        linkedList4.addFirst(19);
        linkedList4.addFirst(17);
        linkedList4.addFirst(14);
        //linkedList4.addFirst(222);
        //linkedList4.addFirst(122);
        linkedList4.display();
        LinkedList4 linkedList41=new LinkedList4();
        linkedList41.addFirst(20);
        linkedList41.addFirst(18);
        linkedList41.addFirst(12);
        linkedList41.addFirst(2);
        linkedList41.display();
        /*createCut(linkedList4.head,linkedList41.head);//构造相交
        Node ret=getIntersect(linkedList4.head,linkedList41.head);
        System.out.println(ret.data);*/
        Node ret1=uniteLinked(linkedList4.head,linkedList41.head);
        linkedList4.display2(ret1);
    }
}
