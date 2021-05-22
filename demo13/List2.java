package data3;

import java.util.*;

public class List2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        //17.1List转数组
        /*Object[] objects = list.toArray();
        for (Object o : objects) {
            String s = (String)o;
            // toLowerCase 转小写
            System.out.print(s.toLowerCase());
        }*/

        // 数组容量 < list.size()
        /*String[] sArray = new String[1];//容量不够
        sArray[0] = "hello";
        String[] strings = list.toArray(sArray);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(sArray));*/
        // 数组容量 == list.size()
        /*String[] sArray = new String[5];//容量足够
        String[] strings = list.toArray(sArray);// 打印数组，需要使用 Arrays.toString
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(sArray));
        // sArray 和 strings 指向同一个对象
        System.out.println(sArray == strings);*/
        // 数组容量 > list.size()
        /*String[] Array = new String[8];//容量大
        String[] strings1 = list.toArray(Array);
        System.out.println(strings1 == Array);  // 返回 true
        System.out.println(Arrays.toString(strings1));
        System.out.println(Arrays.toString(Array));*/

        //17.2数组转List
        String[] sArray = { "Hello", "study", "中国" };
        List<String> strings = Arrays.asList(sArray);
        System.out.println(strings);
    }

    public static void main1(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Iterator<String> it = list.iterator();//14.1返回迭代器（iterator只能从前往后）

        while (it.hasNext()) {  // hasNext() 被调用 6 次
            String next = it.next();    // next() 被调用 5 次
            System.out.print(next+" ");
        }
        System.out.println();

        // 14.2上述写法，可以被 foreach 写法替代，foreach 写法，本质上，其实就是通过迭代器实现的
        for (String next : list) {
            System.out.print(next+" ");
        }
        System.out.println();

        // 14.3同时存在多个迭代器的情况下，各迭代器之间互相独立
        Iterator<String> it1 = list.iterator();
        Iterator<String> it2 = list.iterator();

        it1.next();     // A
        it1.next();     // B

        System.out.println(it1.next()); // 这里打印什么：C
        System.out.println(it2.next()); // 这里打印什么：A

        // 这种删除写法会抛异常
        /*for (String next : list) {
            if (next.equals("C")) {
                list.remove("C");
            }
        }*/
        // 14.4正确的:使用迭代器删除当前迭代到的元素
        /*Iterator<String> it5 = list.iterator();
        while (it5.hasNext()) {
            String next = it5.next();
            if (next.equals("C")) {
                it5.remove();    // 删除当前迭代到的元素
            }
        }
        System.out.println(list);*/

//        ListIterator<String> it6 = list.listIterator(1);//16.listIterator可以从任意位置遍历
//        ListIterator<String> it7 = list.listIterator(1);
//        System.out.println(it6.next()); // 打印 B(ABCDE--01234)
//        System.out.println(it7.previous()); // 打印 A(EDCBA--54321)

        ListIterator<String> it8 = list.listIterator(list.size());//15.listIterator可以从后往前遍历
        while (it8.hasPrevious()) {
            String previous = it8.previous();
            System.out.print(previous);
        }
        System.out.println();
        while (it8.hasNext()) {
            String next = it8.next();
            System.out.print(next);
        }
    }
}
