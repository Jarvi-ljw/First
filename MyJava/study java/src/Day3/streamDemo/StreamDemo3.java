package Day3.streamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {

        //stream流的中间方法

        List<String> list =new ArrayList<>();
        list.add("张三1");
        list.add("张三");
        list.add("张三3");

        Stream<String> s1 =list.stream();
        s1.filter(s->s.startsWith("张")&& s.length()==3).forEach(System.out::println);

        System.out.println("----------------------------------------");
        //排序
        List<Double> list2 =new ArrayList<>();
        list2.add(2.3);
        list2.add(3.4);
        list2.add(1.2);
        list2.add(1.2);
        System.out.println("----------------------------------------");
        list2.stream().sorted().forEach(System.out::println);//默认是升序
        System.out.println("----------------------------------------");
        list2.stream().sorted((num1,num2)->Double.compare(num2,num1)).forEach(System.out::println);//降序
        System.out.println("----------------------------------------");
        list2.stream().sorted((num1,num2)->Double.compare(num2,num1)).limit(2).forEach(System.out::println);//只要前两名
        System.out.println("----------------------------------------");
        list2.stream().sorted((num1,num2)->Double.compare(num2,num1)).skip(2).forEach(System.out::println);//跳过前两名
        System.out.println("----------------------------------------");
        list2.stream().sorted((num1,num2)->Double.compare(num2,num1)).distinct().forEach(System.out::println);//去重

        //映射/加工方法
        list2.stream().map(s->"加10分后"+(s+10)).distinct().forEach(System.out::println);

        //合并流
        System.out.println("----------------------------------------");
        Stream<Object> list3 =Stream.concat(list.stream(),list2.stream());
        System.out.println(list3.count());

    }
}
