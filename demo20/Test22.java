package data22;

public class Test22 {
    public static void main(String[] args) {
        Deque deque = new LinkedListDeque();

        // 栈的
        deque.push(1);
        deque.push(2);
        deque.push(3);
        deque.push(4);
        deque.push(5);
        System.out.println(deque.peek());   // 5
        System.out.println(deque.peek());   // 5
        System.out.println(deque.pop());    // 5
        System.out.println(deque.pop());    // 4
        System.out.println(deque.pop());    // 3

        Deque deque1 = new LinkedListDeque();
        // 队列
        deque1.add(1);
        deque1.add(2);
        deque1.add(3);
        deque1.add(4);
        deque1.add(5);
        System.out.println(deque1.element());    // 1
        System.out.println(deque1.element());    // 1
        System.out.println(deque1.remove());     // 1
        System.out.println(deque1.remove());     // 2
    }
}
