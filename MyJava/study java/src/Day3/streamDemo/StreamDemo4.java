package Day3.streamDemo;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo4 {
    public static void main(String[] args) {
        //1.stream流的终结方法

        List<String> list =new ArrayList<>();
        list.add("张无忌");
        list.add("王林");
        list.add("孙悟空");

        //1.foreach终结
        list.stream().filter(s->s.startsWith("张")).forEach(System.out::println);

        //2.count终结
        long count =list.stream().filter(s->s.startsWith("张")).count();
        System.out.println(count);


        List<Integer> list2 =new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        //3.max终结
        Optional<Integer>max=list2.stream().max((num1, num2)->Integer.compare(num1,num2));
        int max1 =max.get();
        System.out.println(max1);


        //4.min终结
        Optional<Integer> min=list2.stream().min((num1,num2)->Integer.compare(num1,num2));
        int min1 =min.get();
        System.out.println(min1);

        System.out.println("---------------------------------------------");
        //stream流的收集方法

        //收集到list集合
        List<String> collList=list.stream().filter(name->name.startsWith("张")).collect(Collectors.toList());
        System.out.println(collList);

        //收集到set集合
        Set<String> collSet=list.stream().filter(name->name.startsWith("王")).collect(Collectors.toSet());
        System.out.println(collSet);

        //收集到数组
        Object[] collArr=list.stream().filter(name->name.startsWith("张")).toArray();
        System.out.println(Arrays.toString(collArr));

        //收集到map集合
        Map<String, Integer> map = list.stream().filter(name -> name.startsWith("张")).collect(Collectors.toMap(name-> name, name-> name.length()));
        System.out.println(map);
    }
}
