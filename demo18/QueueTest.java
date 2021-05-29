package data11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        //FIFO
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        // 1 1 1
//        System.out.println(queue.element());
//        System.out.println(queue.element());
//        System.out.println(queue.element());
        // 1 2 3
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
        //System.out.println(queue.remove());//抛异常
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());//return null
        System.out.println(queue.isEmpty());
    }
}
