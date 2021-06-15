package data53;

import java.util.*;

public class UseJdkMethod {
    //1.jdk数组排序
    private static Person[] createPersonArray() {
        Person[] personArray = new Person[10];
        for (int i = 0; i < 10; i++) {
            personArray[i] = new Person();
        }

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            personArray[i].age = random.nextInt(20) + 5;
            personArray[i].height = random.nextInt(100) + 20;
            personArray[i].weight = random.nextInt(80) + 30;
        }
        return personArray;
    }

    public static void main(String[] args) {
        Person[] personArray = createPersonArray();
        System.out.println(Arrays.toString(personArray));
        Arrays.sort(personArray, new Comparator<Person>() {//排序
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println(Arrays.toString(personArray));
    }

    //2.JDK提供的List排序方法
    public static void main1(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(3);
            list.add(5);
            list.add(7);
            list.add(9);
            list.add(2);
            list.add(4);
            System.out.println(list);
            //1.
            /*list.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1-o2;
                }
            });*/
            //2.
            Collections.sort(list);
            System.out.println(list);
    }
}
