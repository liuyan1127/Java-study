package data31;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //MyPriorityQueueDemo queue=new MyPriorityQueueDemo();
        queue.add(3);
        queue.add(5);
        queue.add(2);
        queue.add(7);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}


