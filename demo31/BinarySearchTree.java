package data61;

public class BinarySearchTree {
    private Node root;
    public BinarySearchTree() {
        root = null;
    }

    //1.查找
    public boolean search(Integer key) {
        Node current = root;
        while (current != null) {
            int cmp = key.compareTo(current.key);
            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    //2.插入
    public void insert(Integer key) {
        if (root == null) {
            root = new Node(key);
            return;
        }
        //  parent 是 current 的双亲节点
        Node parent = null;
        Node current = root;
        int cmp = 0;
        while (current != null) {
            cmp = key.compareTo(current.key);
            if (cmp == 0) {
                throw new RuntimeException("不允许出现相同的 key");
            } else if (cmp < 0) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }
        Node node = new Node(key);
        if (cmp < 0) {
            parent.left = node;
        } else {
            parent.right = node;
        }
    }
    //3.删除
    public boolean remove(Integer key) {
        //查找要删除的 key 所在的节点node。node 的双亲节点 parent
        Node parent = null;
        Node current = root;
        while (current != null) {
            int cmp = key.compareTo(current.key);
            if (cmp == 0) {
                removeInternal(current, parent);
                return true;
            } else if (cmp < 0) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }
        return false;
    }
    private void removeInternal(Node node, Node parent) {//删除节点
        if (node.left == null && node.right == null) {
            if (node == root) {
                root = null;
            } else if (node == parent.left) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (node.left != null && node.right == null) {
            if (node == root) {
                root = node.left;
            } else if (node == parent.left) {
                parent.left = node.left;
            } else {
                parent.right = node.left;
            }
        } else if (node.left == null && node.right != null) {
            if (node == root) {
                root = node.right;
            } else if (node == parent.left) {
                parent.left = node.right;
            } else {
                parent.right = node.right;
            }
        } else {
            // 使用替换法删除,node 的左子树中的最大值所在的节点temp,双亲tempParent
            Node tempParent = node;
            Node temp = node.left;
            // 一路朝右查找，直到 ghost.right == null
            while (temp.right != null) {
                tempParent = temp;
                temp = temp.right;
            }
            // 替换
            node.key = temp.key;
            //删除
            if (node == tempParent) {
                tempParent.left = temp.left;
            } else {
                tempParent.right = temp.left;
            }
        }
    }
}
