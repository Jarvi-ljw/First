package Day5.threadsafe;

public class threadSafe {
    public static void main(String[] args) {
        //1.定义一个账户类来记录账户的信息

        //2.创建账户对象
        Account acc =new Account("ICBC-110",100000);

        //3.创建一个取钱线程

        //4.创建取钱对象：取钱的人是谁，账户是谁（设置线程名）
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();
    }
}
