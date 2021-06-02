package data26;

public class TreeTraver {
    // 对 root 为根的树进行遍历
    public static void preTraversal(TreeNode root) {
        if (root != null) {
            // 下面的处理，有个前提：这棵树不是空树（根节点存在)
            // 处理根结点
            System.out.printf("%c", root.v);
            // 按照前序的方式，递归处理该结点的左子树
            preTraversal(root.left);
            // 按照前序的方式，递归处理该结点的右子树
            preTraversal(root.right);
        }
    }

    public static void middleTraversal(TreeNode root) {
        if (root != null) {
            // 中序遍历左子树
            middleTraversal(root.left);
            // 处理根
            System.out.printf("%c", root.v);
            //中序遍历右子树
            middleTraversal(root.right);
        }
    }

    public static void afterTraversal(TreeNode root) {
        if (root != null) {
            afterTraversal(root.left);
            afterTraversal(root.right);
            System.out.printf("%c", root.v);
        }
    }

    public static void main(String[] args) {
        // 先构造结点
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');
        TreeNode g = new TreeNode('G');
        TreeNode h = new TreeNode('H');
        TreeNode i = new TreeNode('I');
        TreeNode j = new TreeNode('J');

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = null;

        c.left = e;
        c.right = f;

        d.left = null;
        d.right = g;

        e.left = null;
        e.right = null;

        f.left = h;
        f.right = i;

        g.left = j;
        g.right = null;

        h.left = null;
        h.right = null;

        i.left = null;
        i.right = null;

        j.left = null;
        j.right = null;

        System.out.printf("前序遍历: ");
        preTraversal(a);
        System.out.println();

        System.out.printf("中序遍历: ");
        middleTraversal(a);
        System.out.println();

        System.out.printf("后序遍历: ");
        afterTraversal(a);
        System.out.println();
    }
}
