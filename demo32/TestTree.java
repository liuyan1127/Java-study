package data61;

public class TestTree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(9);
        tree.insert(10);
        tree.insert(2);
        tree.insert(0);
        tree.insert(8);
        tree.insert(4);
        tree.insert(1);
        tree.insert(6);

       // tree.insert(7);
        for (int i = -1; i <= 11; i++) {
            System.out.println(i + ": " + tree.search(i));
        }


        System.out.println(new BinarySearchTree().search(9));//空数的查找（匿名对象）
    }
}
