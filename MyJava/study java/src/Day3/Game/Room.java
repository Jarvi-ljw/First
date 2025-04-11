package Day3.Game;

import java.util.*;

public class Room {
   static Random random = new Random();
   static Scanner sc = new Scanner(System.in);
   static int flag=1;
    public void start() {
        //1.定义牌的种类和花色
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] kingCards = {"🃏", "😀"};

        //2.将这些牌获取并存储到牌的集合当中
        List<Card> listCard = new ArrayList<>();


        //3.将牌的大小和花色进行组合存储在listCard中
        for (String size : sizes) {
            //定义一个flag来记录每张牌排序时的值
            for (String color : colors) {
                //将牌的大小和花色进行组合存放到集合中
                Card card = new Card(size, color,flag);//创建一个牌对象来接牌的size和color
                listCard.add(card);
            }
            //每一张size牌和4张color结合后，flag+1
            flag++;

        }

        //4.添加大小王
        /*Collections.addAll(listCard, new Card(kingCards[0],""));
        Collections.addAll(listCard, new Card(kingCards[1],""));*/
        Collections.addAll(listCard,new Card(kingCards[0],"",15),new Card(kingCards[1],"",14));
        System.out.println("所有的牌为：");
        System.out.println(listCard);


        //5.打乱牌的顺序
        Collections.shuffle(listCard);
        System.out.println("打乱牌的顺序为：");
        System.out.println(listCard);


        //6.发牌
        //定义三个玩家来获取牌
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        for (int i=0;i<listCard.size()-3;i++){
           if (i%3==0){
               //玩家1获得牌
              player1.add(listCard.get(i));
           } else if (i%3==1) {
               //玩家2获得牌
              player2.add(listCard.get(i));
           }else if (i%3==2) {
               //玩家3获得牌
              player3.add(listCard.get(i));
           }
        }

        //设置抢地主机制，将剩余三张底牌添加到玩家的牌当中
        //定义一个底牌集合
        List<Card> bottomCards = new ArrayList<>();
        //获取底牌添加到底牌集合中
        for (int i = listCard.size()-3; i < listCard.size(); i++) {
            bottomCards.add(listCard.get(i));
        }
        System.out.println("底牌为："+bottomCards);
        int index = random.nextInt(3)+1;
        System.out.println("玩家"+index+"获得底牌");
        if (index==1){
            player1.addAll(bottomCards);
        } else if (index==2) {
            player2.addAll(bottomCards);
        }else {
            player3.addAll(bottomCards);
        }


        //8.排序
        Collections.sort(player1, (o1, o2) -> o1.getValue() - o2.getValue());
        Collections.sort(player2, (o1, o2) -> o1.getValue() - o2.getValue());
        Collections.sort(player3, (o1, o2) -> o1.getValue() - o2.getValue());

        //9.显示每个玩家的牌
        System.out.println("玩家1的牌为："+player1+"牌总数为:"+player1.size());
        System.out.println("玩家2的牌为："+player2+"牌总数为:"+player2.size());
        System.out.println("玩家3的牌为："+player3+"牌总数为:"+player3.size());


    }
}



//太狗屎了
//添加抢地主机制：设置一个随机数来设置第一个抢地主牌的人
/*
int index = random.nextInt(3)+1;
        System.out.println("抢地主的第一个人为玩家"+index);
        System.out.println("请玩家"+index+"输入是否抢地主");
String close = sc.next();
            switch (close){
        case "抢地主":
        System.out.println("玩家"+index+"抢地主成功");
//将底牌添加到该玩家的牌中
                    players.get(index-1).addAll(bottomCards);
                   break;
                           case "不抢":
                           System.out.println("玩家"+index+"不抢地主");
                    if (index==1){
        //如果玩家1不抢地主的话，就让索引值变为2让玩家2抢地主
        System.out.println("玩家1不抢地主,玩家2是否抢地主");
index=2;
String close2 = sc.next();
                        switch (close2){
        case "抢地主":
        System.out.println("玩家"+index+"抢地主成功");
//将底牌添加到该玩家的牌中
                                players.get(index-1).addAll(bottomCards);
                                break;
                                        case "不抢":
                                        System.out.println("玩家"+index+"不抢地主");
//如果玩家2不抢地主的话，就让索引值变为3让玩家3抢地主
                        }
                                }else if (index==2){
//如果玩家2不抢地主的话，就让索引值变为3让玩家3抢地主
index=3;
        System.out.println("玩家2不抢地主,玩家3是否抢地主");
String close3 = sc.next();
                        switch (close3){
        case "抢地主":
        System.out.println("玩家"+index+"抢地主成功");
//将底牌添加到该玩家的牌中
                                players.get(index-1).addAll(bottomCards);
                                break;
                                        case "不抢":
                                        System.out.println("玩家"+index+"不抢地主");
//如果玩家3不抢地主的话，就让索引值变为1让玩家1抢地主
                        }
                                }else if (index==3){
//如果玩家3不抢地主的话，就让索引值变为1让玩家1抢地主
index=1;
        System.out.println("玩家3不抢地主,玩家1是否抢地主");
String close4 = sc.next();
                        switch (close4){
        case "抢地主":
        System.out.println("玩家"+index+"抢地主成功");
//将底牌添加到该玩家的牌中
                                players.get(index-1).addAll(bottomCards);
                                break;
                                        case "不抢":
                                        System.out.println("玩家"+index+"不抢地主");
//如果玩家1不抢地主的话，就让索引值变为2让玩家2抢地主
                        }
                                }else {
                                //由于都不抢地主，直接让第一个抢地主的玩家直接获得底牌
                                players.get(index-1).addAll(bottomCards);
                    }
                            break;
                            }*/
