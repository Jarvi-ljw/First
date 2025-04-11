package Day3.streamDemo;

import java.util.Arrays;

public class ParamDemo {
    public static void main(String[] args) {
        //了解可变参数
        //test();
        test(1,23,4321);
    }

    //可变参数只能写在参数列表的最后,并且只能存在一个可变参数
    //可变参数对内实际上是一个数组
    public static void test(int age,int... a){
        System.out.println(a.length);//2
      /*  for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/
        System.out.println(Arrays.toString(a));
    }
}
