package study10;

public class Test10 {
    public static void main(String[] args) {
        Linked5 linked5=new Linked5();
        linked5.addFirst(1);
        linked5.addFirst(3);
        linked5.addFirst(3);
        linked5.addFirst(7);
        linked5.addFirst(3);
        linked5.display();
        linked5.addFirst(19);
        linked5.addIndex(2,16);
        linked5.display();
    }
}
