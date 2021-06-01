package data22;

public class LinkedListDeque implements Deque {
    public static class Node{
        private Integer value;
        Node prev;
        Node next;

        Node(Integer x) {
            value= x;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    @Override
    public boolean offerFirst(Integer e) {
        if (size == 0) {
            head = tail = new Node(e);
        } else {
            Node node = new Node(e);
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
        return true;
    }

    @Override
    public Integer peekFirst() {
        if (size == 0) {
            return null;
        }
        return head.value;
    }

    @Override
    public Integer pollFirst() {
        if (size == 0) {
            return null;
        }
        Integer e = head.value;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return e;
    }

    @Override
    public boolean offerLast(Integer e) {
        if (size == 0) {
            head = tail = new Node(e);
        } else {
            Node node = new Node(e);
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size++;
        return true;
    }

    @Override
    public Integer peekLast() {
        if (size == 0) {
            return null;
        }
        return tail.value;
    }

    @Override
    public Integer pollLast() {
        if (size == 0) {
            return null;
        }
        Integer e = tail.value;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        return e;
    }
}
