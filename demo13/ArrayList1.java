package data3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        // 1.构造了一个空的顺序表
        List<String> list1 = new ArrayList<>();
        // 数组 转 List
        List<String> list2 = Arrays.asList(
                "我", "是", "中", "国", "人");
        System.out.println(list2);
        // 2.把原来的容器完全复制了一份   3.要分1清容量和元素个数
//        List<String> list3 = new ArrayList<>(list2);
//        System.out.println(list3);

        List<String> list3 = list2;//3指向2目前指向的对象，即3和2指向同一个对象
        List<String> list4 = new ArrayList<>(list3);//4是重新new了一个新对象
        list3.set(0, "你");
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
    }
}
