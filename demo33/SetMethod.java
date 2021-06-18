package data62;

import java.util.*;

public class SetMethod {
    public static void main(String[] args) {
            Set<String> set = new TreeSet<>();

            System.out.println(set.add("apple"));
            System.out.println(set.add("peach"));
            System.out.println(set.add("banana"));
            System.out.println(set.add("orange"));
            System.out.println(set.size());
            System.out.println(set);

            System.out.println(set.add("apple"));//重复元素不能添加成功
            System.out.println(set.contains("watermelon"));
            System.out.println(set.contains("apple"));
            System.out.println(set.add("watermelon"));
            System.out.println(set.remove("apple"));
            System.out.println(set);

            /*set.clear();
            System.out.println(set.isEmpty());
            System.out.println(set.size());*/

        for (String fruit : set) {
            System.out.println(fruit);
        }
//        while(iterator.hasNext()){//和加强for相同
//            String fruit=iterator.next();
//            System.out.println(fruit);
//        }

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("apple");
        list.add("peach");
        list.add("apple");
        list.add("orange");
        list.add("apple");
        list.add("peach");
        list.add("orange");

        Set<String> set1 = new TreeSet<>(list);//只保留不重复的
        System.out.println(set1);

        Set<Person> people = new TreeSet<>(new Comparator<Person>() {//自定义，要么是Comparable,要么是Comparator
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });
        System.out.println(people.add(new Person()));
        System.out.println(people.add(new Person()));
        System.out.println(people);
    }
    static class Person{

    }
}
