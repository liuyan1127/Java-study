package data27;

public class Search {
    //第一种查找（返回true or false)：树中包含这个节点返回true;没有返回false
    public static boolean contains1(TreeNode root, int v) {
        if (root == null) {
            return false;
        }
        if (root.v == v) {
            return true;
        }
        boolean leftContains = contains1(root.left, v);
        if (leftContains) {
            return true;
        }
        return contains1(root.right, v);
    }

    //第二种查找(返回节点的值 or null)： 1. 在树中找到 v 了，返回第一遇到的 v 所在的结点 2. 如果没找到返回 null
    public static TreeNode contains2(TreeNode root, int v) {
        if (root == null) {
            return null;
        }
        if (root.v == v) {
            return root;
        }
        TreeNode leftContains = contains2(root.left, v);
        if (leftContains != null) {//找到了
            return leftContains;
        }
        return contains2(root.right, v);
    }

    //第三种查找(返回node是不是以root为根的二叉树上的一个结点)：找到返回节点
    public static boolean contains3(TreeNode root, TreeNode node) {
        if (root == null) {
            return false;
        }
        if (root == node) {
            return true;
        }
        boolean leftContains = contains3(root.left, node);
        if (leftContains) {
            return true;
        }
        return contains3(root.right, node);
    }

    public static void main(String[] args) {
        TreeNode root = OneTree.oneTree();

//        System.out.println(contains1(root, 'H'));
//        System.out.println(contains1(root, 'W'));

//        TreeNode a = contains2(root, 'A');
//        System.out.println(a);      // null
//        System.out.printf("%c%n", a.v);
//        TreeNode b = contains2(root, 'Z');
//        System.out.println(b);
        //System.out.printf("%c%n", b.v); // 空指针异常

        System.out.println(contains3(root,root));
        TreeNode c = new TreeNode('A');
        System.out.println(contains3(root, c));
    }
}
