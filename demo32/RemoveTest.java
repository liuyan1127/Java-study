package data61;

public class RemoveTest {
    private static void case1() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        System.out.println(bst.remove(3));//删除的key不在,false
    }

    private static void case2() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        boolean remove = bst.remove(5);//删除只一个节点的树,true
        System.out.println(remove);
    }

    private static void case3() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        //boolean remove = bst.remove(3);//删除左孩子
        boolean remove=bst.remove(6);//右孩子
        System.out.println(remove);
    }

    private static void case6() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(2);
        boolean remove = bst.remove(3);//没有左孩子的
        System.out.println(remove);
    }

    private static void case7() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(2);
        bst.insert(4);
        boolean remove = bst.remove(3);
        System.out.println(remove);
    }

    private static void case8() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(7);
        bst.insert(8);
        bst.insert(5);
        bst.insert(6);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);

        boolean remove = bst.remove(5);
        System.out.println(remove);
    }


    private static void case9() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(7);
        bst.insert(8);
        bst.insert(5);
        bst.insert(6);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);

        boolean remove = bst.remove(7);
        System.out.println(remove);
    }

    private static void case10() {
        BinarySearchTree bst = new BinarySearchTree();
        boolean remove = bst.remove(7);
        System.out.println(remove);
    }

    public static void main(String[] args) {
        case1();
        case2();
        case3();
        case6();
        case7();
        case8();
        case9();
        case10();
    }
}
