package data112;

import java.util.Comparator;

class ByHeightComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.height - o2.height;
    }
}

class ByWeightComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.weight - o2.weight;
    }
}
public class ComparatorData {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("杨", 18, 160, 100);
        Teacher t2 = new Teacher("紫", 38, 170, 80);
        Comparator<Teacher> byHeight = new ByHeightComparator();
        Comparator<Teacher> byWeight = new ByWeightComparator();
        int ret=0;

        // 自然顺序（年龄）
        ret = t1.compareTo(t2);
        System.out.println(ret);      // ret 大于 0，等于 0 还是小于 0

        // 按照身高比较
        ret = byHeight.compare(t1, t2);
        System.out.println(ret);

        // 按照年龄比较
        ret = byWeight.compare(t1, t2);
        System.out.println(ret);

    }
}
