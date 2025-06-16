package Day5.synchronizedthread.threadsafe;

//取钱线程类
public class DrawThread extends Thread{
    private Account acc;
    public DrawThread(Account acc, String names){
        super(names);
        this.acc=acc;

    }
    @Override
    public void run() {
        acc.drawMoney(100000);
    }
}
