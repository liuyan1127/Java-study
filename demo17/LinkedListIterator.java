package data6;

public class LinkedListIterator implements Iterator {
    private LinkedList list;
    private Node cur;

    public LinkedListIterator(LinkedList list) {
        this.list = list;
        this.cur = list.head;
    }

    @Override
    public boolean hasNext() {
        return cur != null;
    }

    @Override
    public Integer next() {
        Integer e = cur.element;
        cur = cur.next;
        return e;
    }
}
