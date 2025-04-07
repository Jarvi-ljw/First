package Day3.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);//[张三, 李四, 王五]

        list.remove(1);
        System.out.println(list);//[张三, 王五]

        list.set(1,"ljw");
        System.out.println(list);//[张三, ljw]
        System.out.println(list.get(1));//ljw

        list.add(1,"xzw");
        System.out.println(list);//[张三, xzw, ljw]

        //利用索引进行遍历
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //利用增强for遍历
        for (String name:list){
            System.out.println(name);
        }

        //迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //利用lambda遍历
        list.forEach(name->{
            System.out.println(name);
        });
    }
}
