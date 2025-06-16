package Day5.executorservicedemo1;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName()+"输出"+i);
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
