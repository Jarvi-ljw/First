package Day2.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<String> list = new ArrayList<>();
        //ArrayList集合添加元素
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);
        //ArrayList集合查找元素
        System.out.println(list.get(1));
        //遍历ArrayList集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //ArrayList集合修改元素
        list.set(0,"赵六");
        System.out.println(list);
        //ArrayList集合删除元素
        System.out.println(list.remove(0));
    }
}
