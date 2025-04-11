package Day3.Game;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Card {
    //定义斗地主牌的属性
    private String size;//牌的大小
    private String color;//牌的花色
    private int value;//自定义一个牌的大小用来对每张牌进行一个排序


    //重写toString方法
    @Override
    public String toString() {
        return size+color;
    }
}
