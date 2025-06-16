package Day5.thread;

public class ThreadDemo2 {
    //创建多线程的第二张方式：创建一个类进程runnable接口，好处是可以继承多个接口，拓展性强
    public static void main(String[] args) {
        //2.创建子类对象
        Runnable myRunnable = new myRunnable();

        //3.创建进程对象，将myRunnable对象封装给进程对象
        Thread t1 = new Thread(myRunnable);

        //4.启动进程
        t1.start();

        //模拟主线程
        for (int i = 1; i <= 5; i++) {
            System.out.println("主线程:" + i);
        }
    }
}

//1.创建Runnable的子类，必须重写run方法
class myRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("子线程:" + i);
        }
    }
}
