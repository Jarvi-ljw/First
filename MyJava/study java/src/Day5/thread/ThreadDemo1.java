package Day5.thread;

public class ThreadDemo1 {
    //创建进程的第一种方式:创建thread类的子类对象
    public static void main(String[] args) {
        //2.创建线程子类对象
        Thread t1 = new myThread();

        //3.启动线程
        t1.start();

        //4.模拟主线程
        for (int i = 1; i <= 5; i++) {
            System.out.println("主线程:" + i);
        }
    }
}

//1.定义thread类的子类
class myThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("子线程:" + i);
        }
    }
}

