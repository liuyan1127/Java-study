package data28;

import java.util.LinkedList;
import java.util.Queue;

public class LevelTraversal {
    public static void levelTreeTraversal(TreeNode root) {//1.层序遍历二叉树
        if (root == null) {
            return;
        }
        // 队列的元素类型是树的结点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            // 我的代码中，没有考虑过 node == null 的情;暂时通过打印观察结果
            System.out.println(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public static boolean isCompleteTree(TreeNode root) {//2.判断是否是完全二叉树
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (true) {
            // 所以代码根本没有考虑 queue empty 的情况
            TreeNode node = queue.remove();
            if (node == null) {
                break;
            }
            queue.add(node.left);
            queue.add(node.right);
        }
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node == null) {
            } else {
                return false;
            }
        }
        return true;
    }

    // 用来打包层次和结点的
    static class LevelNode {
        TreeNode node;
        int level;
        LevelNode(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    public static void levelTreeWithLevel(TreeNode root) {//3.带层级数的层序遍历
        if (root == null) {
            return;
        }
        Queue<LevelNode> queue = new LinkedList<>();
        queue.add(new LevelNode(root, 1));
        while (!queue.isEmpty()) {
            LevelNode nl = queue.remove();
            TreeNode node = nl.node;
            int level = nl.level;
            System.out.println(level);
            System.out.println(node.val);
            if (node.left != null) {
                queue.add(new LevelNode(node.left, level + 1));
            }
            if (node.right != null) {
                queue.add(new LevelNode(node.right, level + 1));
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = BuildTree.buildTree();
        levelTreeTraversal(root);
        System.out.println("============================");
        System.out.println(isCompleteTree(root));
        levelTreeWithLevel(root);
    }
}
