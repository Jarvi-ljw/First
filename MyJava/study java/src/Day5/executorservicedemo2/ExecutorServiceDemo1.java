package Day5.executorservicedemo2;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) {
        //目标:如何创建线程池对象
        //方式1：使用ExecutorService的实现类ThreadPoolExecutor创建一个线程池对象
        ExecutorService pool =new ThreadPoolExecutor(3,5,10,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(2),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());


        //处理callable任务
        Future<String> submit = pool.submit(new MyCallable());
        Future<String> submit2 = pool.submit(new MyCallable());
        Future<String> submit3 = pool.submit(new MyCallable());
        Future<String> submit4 = pool.submit(new MyCallable());

        try {
            System.out.println(submit.get());
            System.out.println(submit2.get());
            System.out.println(submit3.get());
            System.out.println(submit4.get());//复用线程
        }catch (Exception e){
            e.printStackTrace();
        }




    }


}
