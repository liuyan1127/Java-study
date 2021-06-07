package data29;

import java.util.Deque;
import java.util.LinkedList;

public class NotRecursive {
    public static void preTraversal(TreeNode root) {//前序的
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                System.out.println(current.val);
                stack.push(current);
                current = current.left;
            }
            TreeNode top = stack.pop();
            current = top.right;
        }
    }

    public static void middleTraversal(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            TreeNode top = stack.pop();
            System.out.println(top.val);
            current = top.right;
        }
    }

    public static void afterTraversal(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        TreeNode last = null;
        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            TreeNode top = stack.peek();
            if (top.right == null) {
                stack.pop();
                last = top;
                System.out.println(top.val);
            } else if (top.right == last) {
                stack.pop();
                last = top;
                System.out.println(top.val);
            } else {
                current = top.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode('A');
        TreeNode n2 = new TreeNode('B');
        TreeNode n3 = new TreeNode('C');
        TreeNode n4 = new TreeNode('D');
        TreeNode n5 = new TreeNode('E');
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right=n5;
        preTraversal(n1);
        System.out.println("=============");
        middleTraversal(n1);
        System.out.println("=============");
        afterTraversal(n1);
    }
}
