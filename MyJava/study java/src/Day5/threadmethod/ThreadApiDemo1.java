package Day5.threadmethod;

public class ThreadApiDemo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 =new myThread("1号线程");
        t1.start();
        t1.join();

        Thread t2=new myThread("2号线程");
        t2.start();

        for (int i = 1; i <=5; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }


    }
}
class myThread extends Thread{
    public myThread(){

    }

    public myThread(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
