package Day4.recursionDemo;

public class RecursionDemo3 {
    public static void main(String[] args) {
        //解决猴子吃桃问题
        //递归公式：f(day+1）=f(day)-f(day)/2-1

        //终结点：day==10;

        //递归方向day=1开始到day==10
        System.out.println(f(1));
    }
    public static int f(int day){
        if (day==10){
            return 1;
        }else {
          return 2*f(day+1)+2;
        }
    }
}
