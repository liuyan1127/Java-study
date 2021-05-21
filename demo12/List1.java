package data3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(4);
        list.add(9);
        list.add(10);
        list.add(11);
        System.out.println(list);

        list.sort(new Comparator<Integer>() {//对链表排序
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;//从小到大
            }
        });
        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;//从大到小
            }
        });
        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;//不改变顺序
            }
        });
        System.out.println(list);
    }


    public static void main2(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');
        System.out.println(list);
        List<Character> subList = list.subList(1, 4);//[1,4)
        System.out.println(subList);//12.截取一部分线性表
        System.out.println(list);
    }


    public static void main1(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("study");//1.尾插
        list.add("World");
        list.add("study");
        list.add("hard");
        System.out.println(list);

        list.add(3, "加油呀");//2.把元素插在index位置
        System.out.println(list);

        String s = list.get(2);//3.返回指定下标的元素
        System.out.println(s);

        list.set(4, "好的");//4.用e替换index下标处的元素
        System.out.println(list);

        System.out.println(list.size());//5.求元素个数

//        list.remove("study");//6.删除第一个遇到o的元素
//        System.out.println(list);
//        System.out.println(list.size());

//        System.out.println(list.isEmpty());//7.返回是否是空链表
//        list.clear();//8.清空链表
//        System.out.println(list.isEmpty());
//        System.out.println(list.size());

        System.out.println(list.contains("hard"));//9.返回是否包含这个元素
        System.out.println(list.contains("study"));
        System.out.println(list.indexOf("study"));//10.返回第一次遇到这个元素的下标
        System.out.println(list.lastIndexOf("study"));//11.返回最后一个遇到这个元素的下标
        System.out.println(list.indexOf("hard"));
    }
}
