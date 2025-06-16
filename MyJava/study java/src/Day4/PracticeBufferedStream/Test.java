package Day4.PracticeBufferedStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //创建字符输入、输出流管道
        try(
                Reader fr =new FileReader("study java\\src\\Day4\\PracticeBufferedStream\\Test");
                Writer fw =new FileWriter("study java\\src\\Day4\\PracticeBufferedStream\\newPoem.txt");
                ){
            //将字符输入、输出流管道包装成缓存字符输入、输出流管道
            BufferedReader bfr =new BufferedReader(fr);
            BufferedWriter bfw =new BufferedWriter(fw);

            //定义一个行来记录每行内容
            String line ;
            //定义集合来存储每行的内容
            List<String> lists=new ArrayList<>();
            //循环遍历每行的内容
            while ((line = bfr.readLine() )!= null){
                lists.add(line);
            }
            //该算法过于复杂，最好使用collection集合中的sort方法排序
           // Collections.sort(lists,(o1, o2) -> o1.charAt(0)-o2.charAt(0));
            Collections.sort(lists);
           /* //对每行进行一个排序：获取每行的第一个字符
            //定义一个字符数组来记录每行的第一个字符
            char[] chars =new char[lists.size()];
            //对获取到的数字字符进行排序
            //冒泡排序算法:假设有n个数，大循环排序为n-1次排序，由于每次大循环会把最大的数排到最后，则每次小循环排n-1次再-1次排序
            for (int i=0;i< lists.size()-1;i++){

                for (int j=0;j<lists.size()-1-i;j++){
                    if (Character.getNumericValue(lists.get(j).charAt(0))>Character.getNumericValue(lists.get(j+1).charAt(0))){
                        String temp = lists.get(j);
                        lists.set(j,lists.get(j+1));
                        lists.set(j+1,temp);

                    }
                }
            }*/


            //排序好后写入集合中的数据
            for (String l:lists){
                bfw.write(l);
                bfw.write("\r\n");
            }
            bfw.flush();
            bfw.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
