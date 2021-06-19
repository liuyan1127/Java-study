package data63;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapMethod {
    public static void main(String[] args) {
        Map<String,Integer> addressList=new TreeMap<>();
        addressList.put("B",111);
        addressList.put("C",112);
        addressList.put("A",111);
        addressList.put("D",116);

        /*Set<String> keys=addressList.keySet();
        System.out.println(keys);//不可重复
        Collection<Integer>values=addressList.values();
        System.out.println(values);//可重复*/

        Set<String> keys=addressList.keySet();
        for(String key:keys){
            Integer value=addressList.get(key);
            System.out.println(key+"="+value);//遍历对应关系
        }
        System.out.println("===========");
        Set<Map.Entry<String,Integer>>entries=addressList.entrySet();//返回所有的K-V关系
        for (Map.Entry<String, Integer> e : entries) {
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + ":" + value);//遍历
        }
    }



    public static void main1(String[] args) {
        Map<String, Integer> addressList = new TreeMap<>();
        //1.put
        Integer v=addressList.put("B", 119);//K-V关系不存在，
        System.out.println(v);//返回null;
        System.out.println(addressList);
        v=addressList.put("B",911);//k-V关系存在，
        System.out.println(v);//返回原来的 V;
        System.out.println(addressList);
        //2.get
        v=addressList.get("B");//取出对应的 V；
        System.out.println(v);
        v=addressList.get("C");//无 K，返回null
        System.out.println(v);
        v=addressList.getOrDefault("C",998);//无 K，可以指定返回一个默认值
        System.out.println(v);
        System.out.println(addressList);//但K-V关系不会存在于map中
        //3.remove
        v=addressList.remove("B");
        System.out.println(v);//有K-V关系，返回对应的 V
        v=addressList.remove("A");
        System.out.println(v);//没有关系，返回null
        System.out.println(addressList);
    }
}
