package data6;

import data5.ArrayList;

public class LinkedListTest {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(100);
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(24);
        list.add(200);
        System.out.println("list = " + list);//100,11,22,33,24,200
        list.remove(3); // 按照下标删除
        System.out.println("list = " + list);//100,11,22,24,200
        System.out.println(list.remove((Integer) 100)); // true
        System.out.println("list = " + list);//1,22,24,200
        System.out.println(list.get(0));//11
        System.out.println(list.get(3));//200
        list.set(2, 2000);//1,22,2000,200
        System.out.println("list = " + list);

        System.out.println(list.isEmpty());     // false
        list.clear();
        System.out.println(list.isEmpty());
        try {
            list.add(-1, 300);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            list.add(5, 300);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }


    public static void main1(String[] args) {
        List list = new LinkedList();
        list.add(0, 998);
        list.add(31);
        list.add(32);
        list.add(33);
        System.out.println(list);   // [998, 31, 32, 33]

        list.add(0, 1000);
        System.out.println(list);   // [1000, 998, 31, 32, 33]
        list.add(3, 28);
        System.out.println(list);   // [1000, 998, 31, 28, 32, 33]
        list.add(3, 98);
        System.out.println(list);   // [1000, 98, 998, 31, 28, 32, 33]
        list.add(7, 2000);
        System.out.println(list);   // [1000, 98, 998, 31, 28, 32, 33, 2000]

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
