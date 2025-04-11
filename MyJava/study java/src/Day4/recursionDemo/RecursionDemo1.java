package Day4.recursionDemo;

import java.util.Scanner;

public class RecursionDemo1 {
    //求n的阶乘
   static int n;
    public static void main(String[] args) {
        //获取用户输入
        System.out.println("请输入你想求几的阶乘：");
        Scanner sc =new Scanner(System.in);
        while (true) {
            try {
                 n =sc.nextInt();
                 if (n==0){
                     System.out.println("输入0有误，请重新输入");
                     sc.nextLine();

                 }else {
                     System.out.println(n+"的阶乘为:");
                     break;
                 }
            }catch(Exception e){
                System.out.println("输入的数有误，请输入整数");
                //清空缓存区的错误输入
                sc.nextLine();
            }
        }
        //定义一个数来记录n的累乘
        int flag =1;
        for (int i=1;i<=n;i++){
            flag*=i;
        }
        System.out.println(flag);
    }
}
