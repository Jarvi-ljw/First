package Day3.mapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {
    public static void main(String[] args) {
        //Hashmap的特点是无序，不重复，无索引
        Map<String,Integer> map =new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("张三",25);
        System.out.println(map);
        //linkedHashmap的特点是有序，不重复，无索引
        Map<String,Double> map2 =new LinkedHashMap<>();
        map2.put("张三",23.1);
        map2.put("李四",24.2);
        map2.put("王五",25.5);
        map2.put("张三",25.5);
        System.out.println(map2);
        //TreeMap的特点是按照大小升序排序，不重复，无索引
        Map<String,Double> map3 =new TreeMap<>();
        map3.put("张三",23.1);
        map3.put("李四",24.2);
        map3.put("王五",25.5);
        map3.put("张三",22.5);
        System.out.println(map3);

        //map集合的常用方法
        System.out.println(map.get("张三"));//25
        System.out.println(map.containsKey("张三"));//true
        System.out.println(map.containsValue(23));//false

        System.out.println(map.remove("张三"));
        System.out.println(map);//{李四=24, 王五=25}

        map.clear();
        System.out.println(map);//{}






        //map集合的几种遍历方式
        //1.增强for遍历:用键值遍历集合，再用map.get(k)获取value
        for (String k: map2.keySet()){
            System.out.println("key="+k+",value="+map2.get(k));
        }

        //2.键值对遍历:用键值对遍历集合，再分别获取键和值
        for (Map.Entry<String,Double> entry: map2.entrySet()){
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }

        //3.lambda遍历:用键值遍历集合，再分别获取键和值
        map2.forEach((k,v)->{
            System.out.println("key="+k+",value="+v);
        });
    }
}
