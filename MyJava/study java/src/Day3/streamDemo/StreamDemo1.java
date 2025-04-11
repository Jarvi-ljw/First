package Day3.streamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        //目标：认识stream流，掌握其基本使用步骤，体会stream流的优缺点
        //stream流是简化集合、数组的API，结合了Lambda表达式

        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("李四");
        list.add("王五");
        list.add("张六子");

        List<String> newList = new ArrayList<>();
        //传统遍历方式：找出姓名为张的，且名字为3个字的
        for (String name : list) {
            if (name.startsWith("张") && name.length() == 3) {
                newList.add(name);
            }
        }
        System.out.println(newList);


        //stream流
        List<String> newList2 =list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
