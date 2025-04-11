package Day3.streamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {

        List<String> list =new ArrayList<>();
      /*  list.add("张三丰");
        list.add("李四");
        list.add("王五");
        list.add("张六子");*/


        //collection方法批量添加
        Collections.addAll(list,"张三丰","李四","王五","张六子");
        System.out.println(list);

        //collection方法打乱元素顺序(每次运行都不同）
        Collections.shuffle(list);
        System.out.println(list);

        ////collection方法对集合元素升序
        List<Double> list1 =new ArrayList<>();
        Collections.addAll(list1,1.2,3.4,5.6,2.8,4.0);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
