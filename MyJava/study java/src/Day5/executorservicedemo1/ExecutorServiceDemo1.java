package Day5.executorservicedemo1;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) {
        //目标:如何创建线程池对象
        //方式1：使用ExecutorService的实现类ThreadPoolExecutor创建一个线程池对象
        ExecutorService pool =new ThreadPoolExecutor(3,5,10,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(2),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        Runnable target  =new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);//复用线程
        pool.execute(target);
        pool.execute(target);//到了临时线程的创建时机：线程池中的线程都用完了，任务队列也满了
        pool.execute(target);
        //pool.execute(target);//到了任务拒绝策略：线程池中的线程都用完了，任务队列也满了，并且新任务也提交了

        //关闭线程池：一般不关闭线程池
       // pool.shutdown();

    }


}
