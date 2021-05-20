package data112;

class Teacher implements Comparable<Teacher> {
    String name;
    int age;
    int height;
    int weight;

    public Teacher(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Teacher o) {
        if (this.age < o.age) {
            // this 指向的对象小于 o 指向的对象
            return -1;  // 任意负数都可以
        } else if (this.age == o.age) {
            // 等于
            return 0;
        } else {
            // 大于 o
            return 1;
        }
    }
}
public class ComparableData {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("杨", 18, 160, 80);
        Teacher t2 = new Teacher("紫", 8, 170, 100);

        // 对两个对象进行“比较”
        int ret = t1.compareTo(t2);
        if (ret < 0) {
            // 代表的意思就是 t1 指向的对象代表的现实事物 小于 t2 指向的对象代表的现实事物
            System.out.println("杨 小于 紫");
        } else if (ret == 0) {
            //  t1  等于 t2
            System.out.println("杨 等于 紫");
        } else {
            // t1  大于 t2
            System.out.println("杨 大于 紫");
        }
        ret = t2.compareTo(t1);
        System.out.println(ret);
    }
}
