package data11;

import java.util.Deque;
import java.util.LinkedList;
//先进后出FILO
public class StackTest {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
