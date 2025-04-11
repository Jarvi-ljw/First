package Day3.mapDemo;

import java.util.*;

public class MapDemo2 {
    //需求：某个班级80个学生，现在组织秋游活动，班长提供了四个景区依次是（A,B,C,D),让这80个学生投票选择一个景区，票数最多的就选择哪个
    //分析：1.拿到80个学生的投票信息。2.统计投票结果，用map集合来存储投票结果 3。遍历集合统计票数决定最后的景区
    static Random random = new Random();

    public static void main(String[] args) {
        //获得4个地区的80个投票
        List<String> list = vote();

        //创建map集合来存储数据
        Map<String, Integer> map = new HashMap<>();
        //遍历集合统计票数决定最后的景区
        for (String location : list) {
         /*   if (map.containsKey(location)){
                //如果map集合中包含这个key，就取出这个key对应的value，然后加1
                Integer vote = map.get(location);
                vote++;
                map.put(location,vote);
            }else {
                //如果map集合不包含这个key，就直接添加这个key，value为1
                map.put(location,1);
            }*/
            //简化写法
            map.put(location, map.containsKey(location) ? map.get(location) + 1 : 1);
        }

        System.out.println(map);


    }

    public static List<String> vote() {
        //1.拿到80个学生的投票信息。
        //定义一个数组，记录4个地点，用random获取数组的索引值来模拟投票
        String[] votes = {"A", "B", "C", "D"};

        //定义一个集合来记录80个投票结果
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(votes.length);
            String vote = votes[index];
            list.add(vote);
        }
        return list;
    }
}
