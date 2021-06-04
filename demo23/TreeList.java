package data27;

import java.util.ArrayList;
import java.util.List;

public class TreeList {
    //二叉树前序遍历，以List方式返回遍历结果
    public void preTraversalPrint(TreeNode root) {
        if (root != null) {
            System.out.println(root);
            preTraversalPrint(root.left);
            preTraversalPrint(root.right);
        }
    }
    public List<Integer> preTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            // list 先放入根的值
            list.add(root.v);
            // 进行左子树的遍历
            List<Integer> leftTreeList = preTraversal(root.left);
            list.addAll(leftTreeList);
            //进行右子树的遍历
            List<Integer> rightTreeList = preTraversal(root.right);
            list.addAll(rightTreeList);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = OneTree.oneTree();
        TreeList treeList = new TreeList();
        System.out.println(treeList.preTraversal(root));
    }
}
