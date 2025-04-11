package Day3.setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //目标：认识set家族的特点
        //1.HashSet集合的特点：无序，不重复，无索引
        Set<String> set =new HashSet<>();
        set.add("小明");
        set.add("小红");
        set.add("小红");
        set.add("小刚");
        set.add("王麻子");
        System.out.println(set);

       //2.LinkedHashSet集合的特点：有序，不重复，无索引
        Set<String> set1 =new LinkedHashSet<>();
        set1.add("小明");
        set1.add("小红");
        set1.add("小红");
        set1.add("小刚");
        set1.add("王麻子");
        System.out.println(set1);

        //3.TreeSet集合的特点：排序，不重复，无索引
        TreeSet<Double> set2 =new TreeSet<>();
        set2.add(3.14);
        set2.add(2.14);
        set2.add(1.14);
        System.out.println(set2);
    }
}
