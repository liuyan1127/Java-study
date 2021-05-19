package data112;
//判断相等
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person o = (Person)obj;
        return this.name.equals(o.name);
    }
}
public class Equals {
    public static void main(String[] args) {
        Person t1 = new Person("杨紫");
        Person t2 = new Person("杨紫");
        Person t3 = new Person("鹿晗");
        Person t4 = new Person("鹿晗");

        // t1 指向的对象 和 t2 指向的对象，是否代表了同一个现实的事物
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
        System.out.println(t3.equals(t4));
    }
}
