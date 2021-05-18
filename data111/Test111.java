package data111;

public class Test111{
    public static Node reverse(Node head) {
        Node cur = head;
        Node curPrev = null;
        //Node temp = null;

        while (cur != null) {

        Node curNext = cur.next;
        cur.next = curPrev;
        curPrev = cur;
        cur = curNext;
        }

        //return temp;
        return curPrev;
    }
    public static void main(String[] args) {
                // 构造一个 1 2 3 4 的链表
                Node head = new Node();
                head.val = 1;

                head.next = new Node();
                head.next.val = 2;

                head.next.next = new Node();
                head.next.next.val = 3;

                head.next.next.next = new Node();
                head.next.next.next.val = 4;

                // 逆置链表
                Node reverseHead = reverse(head);

                // 打印链表
                Node cur = reverseHead;
                while (cur != null) {
                    System.out.println(cur.val);

                    cur = cur.next;
                }
    }
}

