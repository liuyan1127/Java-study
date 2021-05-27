package data6;

public class LinkedList implements List{
    public Node head;
    public Node tail;
    public int size;
    //public Integer element;

    @Override
    public boolean add(Integer e) {
        Node node=new Node(e);
        if(head==null){
            this.head=node;
            this.tail=node;
        }else{
            this.tail.next=node;
            node.prev=this.tail;
            this.tail=node;
        }
        size++;
        return true;
    }

    @Override
    public void add(int index, Integer e) {
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("下标越界: " + index);
        }
        if(index==size){
            add(e);
        }else if(index==0){
            Node node=new Node(e);
            node.next=this.head;
            this.head.prev=node;
            this.head=node;
            size++;
        }else {
            Node cur;
            if (index - 1 < size / 2) {
                int count = 0;
                cur = head;
                while (count < index - 1) {
                    cur = cur.next;
                    count++;
                }
            } else {
                cur = tail;
                for (int count = 0; count < size - index; count++) {
                    cur = cur.prev;
                }
            }
            Node node=new Node(e);
            Node next=cur.next;
            node.next=next;
            node.prev=cur;
            cur.next=node;
            next.prev=node;

            size++;
        }
    }

    @Override
    public Integer remove(int index) {
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("下标越界: " + index);
        }
        Integer removeNode;
        if(index==0){
            removeNode=head.element;
            this.head=this.head.next;
            head.prev=null;
            size--;
            if(size==0){
                tail=null;
            }
        }else if(index==size-1){
            removeNode=tail.element;
            tail=tail.prev;
            tail.next=null;
            size--;
            if(size==0){
                head=null;
            }
        }else{
            Node cur;
            if (index - 1 < size / 2) {
                int count = 0;
                cur = head;
                while (count < index - 1) {
                    cur = cur.next;
                    count++;
                }
            } else {
                cur = tail;
                for (int count = 0; count < size - index; count++) {
                    cur = cur.prev;
                }
            }
            Node toRemove=cur.next;
            removeNode=toRemove.element;
            cur.next=toRemove.next;
            toRemove.next.prev=cur;
            size--;
        }
        return removeNode;
    }

    @Override
    public boolean remove(Integer e) {
        Node node = null;
        Node cur = head;
        while(cur != null){
            if (cur.element.equals(e)) {
                if (node == null) {
                    remove(0);
                    return true;
                } else {
                    node.next.next.prev = node;
                    node.next = node.next.next;
                    size--;
                    return true;
                }
            }
            node = cur;
            cur = cur.next;
        }
        return false;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("下标越界: " + index);
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.element;
    }

    @Override
    public Integer set(int index, Integer e) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("下标越界: " + index);
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        Integer v = cur.element;
        cur.element = e;
        return v;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Integer e) {
        return indexOf(e) != -1;
    }

    @Override
    public int indexOf(Integer e) {
        int i = 0;
        for (Node cur = head; cur != null; cur = cur.next, i++) {
            if (cur.element.equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        int i = size - 1;
        for (Node cur = tail; cur != null; cur = cur.prev, i--) {
            if (cur.element.equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator(this);
    }

    @Override
    public String toString() {
        StringBuilder sbt = new StringBuilder("[");
        Node cur = head;
        while( cur != null){
            sbt.append(cur.element);
            if (cur != tail) {
                sbt.append(", ");
            }
            cur = cur.next;
        }
        sbt.append("]");
        return sbt.toString();
    }
}
