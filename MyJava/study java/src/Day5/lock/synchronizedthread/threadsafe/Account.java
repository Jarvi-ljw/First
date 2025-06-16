package Day5.lock.synchronizedthread.threadsafe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String cardId;
    private double money;
    private final Lock lk=new ReentrantLock();//保护锁对象

public void drawMoney(double money){
    //拿到当前是谁来取钱
    String name =Thread.currentThread().getName();
    lk.lock();//上锁
    try {
        //判断余额是否足够
        if (this.money>=money){
            System.out.println(name+"取钱成功，一共取出"+money+"元");
            this.money-=money;
            System.out.println(name+"取钱成功,剩余余额"+(this.money)+"元");
        }else {
            System.out.println(name+"取钱失败，余额不足");
        }
    } finally {
        lk.unlock();//解锁
    }

}

}
