package study10;

class ListNode {
    public int data;
    public ListNode next;
    public ListNode prev;

    public ListNode(int data) {
        this.data = data;
    }
}
public class Linked5 {
        public ListNode head;

        public ListNode tail;
        //头插法
        public void addFirst(int data){
            ListNode node = new ListNode(data);
            if(this.head == null) {
                this.head = node;
                this.tail = node;
            }else {
                node.next = this.head;
                this.head.prev = node;
                this.head = node;
            }
        }

        //尾插法
        public void addLast(int data) {
            ListNode node = new ListNode(data);
            if(this.head == null) {
                this.head = node;
                this.tail = node;
            }else {
                this.tail.next = node;
                node.prev = this.tail;
                this.tail = node;
            }
        }
        public void display() {
            ListNode cur = this.head;
            while (cur != null) {
                System.out.print(cur.data+" ");
                cur = cur.next;
            }
            System.out.println();
        }

        //任意位置插入,第一个数据节点为0号下标
        public void addIndex(int index,int data) {
            if(index < 0 || index > size()) return;
            if(index == 0) {
                addFirst(data);
                return;
            }
            if(index == size()) {
                addLast(data);
                return;
            }
            ListNode cur = searchIndex(index);
            ListNode node = new ListNode(data);
            node.next = cur;
            node.prev = cur.prev;
            cur.prev.next = node;
            cur.prev = node;
        }
        public ListNode searchIndex(int index) {
            ListNode cur = this.head;
            while (index > 0) {
                cur = cur.next;
                index--;
            }
            return cur;
        }
    //得到链表的长度
    public int size(){
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
}
