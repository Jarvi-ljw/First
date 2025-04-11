package Day3.streamDemo;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //目标:获取stream流


        //collection集合获取stream流
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张三2");
        list.add("张三3");
        list.add("张三4");

        Stream<String> s1 =list.stream();


        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("张三2");
        set.add("张三3");
        Stream<String> s2 = set.stream();

        //map集合获取stream流
        Map<String,Integer> map = new HashMap<>();
        //获取键流
        Stream<String> s3 =map.keySet().stream();
        //获取值流
        Stream<Integer> s4 =map.values().stream();

        //获取键值对流
        Stream<Map.Entry<String,Integer>> s5 =map.entrySet().stream();

        //数组获取stream流
        String[] arr = new String[]{"张三","张三2","张三3"};
        Stream<String> s6 =Arrays.stream(arr);
        Stream<String> s7 =Stream.of(arr);
    }
}
