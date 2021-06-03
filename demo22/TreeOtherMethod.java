package data27;

public class TreeOtherMethod {
    private static int n;
    public static int sumTreeNodeSize(TreeNode root) {//1.1遍历的写法=求二叉树节点个数
        n = 0;
        preTraversal(root);
        return n;
    }
    public static void preTraversal(TreeNode root) {
        if (root != null) {
            // 处理根结点
            n++;
            //System.out.printf("%c", root.v);
            preTraversal(root.left);
            preTraversal(root.right);
        }
    }

    // 1.2归总的解法=根的个数 + 左子树的结点个数 + 右子树的结点个数
    public static int sumTreeNodeSize2(TreeNode root) {
        // root 可能有两种情况
        if (root == null) {
            // 空树
            return 0;
        } else {
            int rootNodeSize = 1;   // 根的结点个数
            int leftSubTreeNodeSize = sumTreeNodeSize2(root.left);
            int rightSubTreeNodeSize = sumTreeNodeSize2(root.right);
            int size= rootNodeSize + leftSubTreeNodeSize + rightSubTreeNodeSize;
            return size;
        }
    }

    //2.1计算叶子结点个数(度为0的节点）
    private static int leafNodeSize;
    public static int sumTreeLeafNodeSize(TreeNode root) {
        leafNodeSize = 0;
        preTraversal2(root);
        return leafNodeSize;
    }
    private static void preTraversal2(TreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                leafNodeSize++;
            }
            preTraversal2(root.left);
            preTraversal2(root.right);
        }
    }

    //2.2
    public static int sumTreeLeafNodeSize2(TreeNode root) {
        if (root == null) {
            // 一棵空树，求叶子结点个数是 0
            return 0;
        } else if (root.left == null && root.right == null) {
            // 一棵只有一个结点的树，叶子结点个数是 1
            return 1;
        } else {// 整棵树的叶子结点个数 = 左子树的叶子节点个数 + 右子树的叶子结点个数
            int leftSubTreeLeafSize = sumTreeLeafNodeSize2(root.left);
            int rightSubTreeLeafSize = sumTreeLeafNodeSize2(root.right);
            return leftSubTreeLeafSize + rightSubTreeLeafSize;
        }
    }

    //3.获取树的高度
    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            int leftSubTreeHeight = getHeight(root.left);
            int rightSubTreeHeight = getHeight(root.right);
            int ret=Math.max(leftSubTreeHeight, rightSubTreeHeight) + 1;
            return ret;
        }
    }

    //4.求第k层节点个数
    public static int sumLevelNodeSize(TreeNode root, int k) {
        if (root == null) {
            return 0;
        } else if (k == 1) {
            return 1;
        } else {
            int leftSubTreeLevel = sumLevelNodeSize(root.left, k - 1);
            int rightSubTreeLevel  = sumLevelNodeSize(root.right, k - 1);
            return leftSubTreeLevel  + rightSubTreeLevel ;
        }
    }

    //5.1查找一棵树中是否含有某一个节点
    public static boolean contains2(TreeNode root, int v) {
        if (root == null) {
            return false;
        }
        if (root.v == v) {
            return true;
        }
        boolean left = contains2(root.left, v);
        if (left) {
            return true;
        }else {
            return contains2(root.right, v);
        }
    }
    //5.2
    public static boolean contains(TreeNode root, int v) {
        if (root == null) {// 空树
            return false;
        } else {
            if (root.v == v) { // 根里找到了
                return true;
            } else {// 根里没找到
                boolean leftSubTreeContains = contains(root.left, v);
                if (leftSubTreeContains) {// 左子树里找到了
                    return true;
                } else {// 左子树里也没找到
                    boolean rightSubTreeContains = contains(root.right, v);
                    if (rightSubTreeContains) {
                        // 右子树里找到了
                        return true;
                    } else {//都没找到
                        return false;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = OneTree.oneTree();
        int sum = sumTreeNodeSize(root);
        System.out.println("树的结点个数: " + sum);
        int sum1 = sumTreeNodeSize2(root);
        System.out.println("树1的结点个数：" + sum1);
        int sum2 = sumTreeLeafNodeSize2(root);
        System.out.println("树的叶子结点个数：" + sum2);
        int sum3 = sumTreeLeafNodeSize2(root);
        System.out.println("树1的叶子结点个数：" + sum3);
        System.out.println("树的高度是: " + getHeight(root));
        System.out.println("第 1 层结点个数: " + sumLevelNodeSize(root, 1));
        System.out.println("第 2 层结点个数: " + sumLevelNodeSize(root, 2));
        System.out.println("第 3 层结点个数: " + sumLevelNodeSize(root, 3));
        System.out.println("第 4 层结点个数: " + sumLevelNodeSize(root, 4));
        System.out.println("第 5 层结点个数: " + sumLevelNodeSize(root, 5));
        System.out.println("第 6 层结点个数: " + sumLevelNodeSize(root, 6));
        System.out.println(contains(null, 'A'));
        System.out.println(contains2(new TreeNode('A'), 'A'));
        System.out.println(contains2(new TreeNode('A'), 'W'));
        System.out.println(contains(root, 'A'));
        System.out.println(contains2(root, 'E'));
        System.out.println(contains(root, 'H'));
        System.out.println(contains2(root, 'W'));
    }
}
