package Day5.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    //创建多线程的第三种方式：创建callable接口的子类，接着将该子类封装给FutureTask的对象。优点是可以返回数据，FutureTask是runnable的子类
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建子类对象
        Callable<String> task = new myCallable(200);

        //将task封装给FutureTask的对象
        FutureTask<String> ft =new FutureTask<>(task);

        //将ft封装给thread类的对象
        Thread t=new Thread(ft);

        //启动线程
        t.start();

        //获取线程的返回值
        System.out.println(ft.get());

        Callable<String> task2=new myCallable(50);
        FutureTask<String> ft2=new FutureTask<>(task2);
        Thread t2=new Thread(ft2);
        t2.start();
        System.out.println(ft2.get());


        int sum=0;
        for (int i=1;i<100;i++){
            sum+=i;
        }
        System.out.println("主线程的和为"+sum);


    }
}

class myCallable implements Callable<String> {

    private int n;

    public myCallable(int n) {
        this.n=n;
    }

    @Override
    public String call() throws Exception {
        //打印一个1-n的值
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "子线程的和为:" + sum;
    }
}
