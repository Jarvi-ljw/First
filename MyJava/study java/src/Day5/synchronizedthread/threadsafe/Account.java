package Day5.synchronizedthread.threadsafe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String cardId;
    private double money;

public void drawMoney(double money){
    //拿到当前是谁来取钱
    String name =Thread.currentThread().getName();
    synchronized (this) {
        //判断余额是否足够
        if (this.money>=money){
            System.out.println(name+"取钱成功，一共取出"+money+"元");
            this.money-=money;
            System.out.println(name+"取钱成功,剩余余额"+(this.money)+"元");
        }else {
            System.out.println(name+"取钱失败，余额不足");
        }
    }

}

}
