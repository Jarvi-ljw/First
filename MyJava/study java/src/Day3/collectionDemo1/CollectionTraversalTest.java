package Day3.collectionDemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTraversalTest {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("枸杞子");
        list.add("西洋参");
        //System.out.println(list);//[java入门, 宁夏枸杞, 黑枸杞, 人字拖, 枸杞子, 西洋参]


        //有索引的集合，for循环遍历删除

        //这种遍历方式会出现错误，因为删除了元素，索引值会改变，可能会导致删不干净
//        for (int i = 0; i < list.size(); i++) {
//           if (list.get(i).contains("枸杞")){
//               list.remove(i);
//           }
//        }
//        System.out.println(list);//[java入门, 黑枸杞, 人字拖, 西洋参]

  /*      for (int i = 0; i < list.size(); i++) {
           if (list.get(i).contains("枸杞")){
               list.remove(i);
               i--;//删除了元素，索引值会改变，可能会导致删不干净，所以要减1
           }
        }
        System.out.println(list);//[java入门, 人字拖, 西洋参]


        ArrayList<String> list2 =new ArrayList<>();
        list2.add("java入门");
        list2.add("宁夏枸杞");
        list2.add("黑枸杞");
        list2.add("人字拖");
        list2.add("枸杞子");
        list2.add("西洋参");

        for (int i=list2.size()-1;i>=0;i--){
            if (list2.get(i).contains("枸杞")){
                list2.remove(i);
            }
        }
        System.out.println(list2);
*/



        //针对没有索引的集合，使用迭代器进行遍历和删除
        ArrayList<String> list3 =new ArrayList<>();
        list3.add("java入门");
        list3.add("宁夏枸杞");
        list3.add("黑枸杞");
        list3.add("人字拖");
        list3.add("枸杞子");
        list3.add("西洋参");

        Iterator<String> it = list3.iterator();
        while (it.hasNext()){
            String name = it.next();
            if (name.contains("枸杞")){
                it.remove();//使用迭代器的方法进行删除
            }
        }
        System.out.println(list3);


        ArrayList<String> list4 =new ArrayList<>();
        list4.add("java入门");
        list4.add("宁夏枸杞");
        list4.add("黑枸杞");
        list4.add("人字拖");
        list4.add("枸杞子");
        list4.add("西洋参");

        //用增强for和lambda都没有办法解决并发修改异常问题
//       /* for (String name:list4){
//            if (name.contains("枸杞")){
//                list4.remove(name);
//            }
//        }
//        System.out.println(list4);*/

        //lambda表达式无法解决同样报错
//        /*list4.forEach(name->{
//            if (name.contains("枸杞")){
//                list4.remove(name);
//            }
//        });
//        System.out.println(list4);*/


    }
//结论：增强for和lambda只适合遍历，不适合做遍历和修改操作



}
