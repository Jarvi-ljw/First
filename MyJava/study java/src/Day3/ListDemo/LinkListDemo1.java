package Day3.ListDemo;

import java.util.LinkedList;

public class LinkListDemo1 {
    public static void main(String[] args) {
        //目标：用LinkedList做一个队列对象
        LinkedList<String> queue =new LinkedList<>();
        //入队
        queue.addLast("王林");
        queue.addLast("李慕婉");
        queue.addLast("许利国");
        queue.addLast("张三");
        System.out.println(queue);//[王林, 李慕婉, 许利国, 张三]

        //出队
        System.out.println(queue.removeFirst());//王林
        System.out.println(queue);//[李慕婉, 许利国, 张三]


        System.out.println("------------------------------------------");
        //目标：用LinkedList做栈对象
        LinkedList<String> stack =new LinkedList<>();
        //压栈
        stack.push("第一颗子弹");
        stack.push("第二颗子弹");
        stack.push("第三颗子弹");
        stack.push("第四颗子弹");
       /* stack.addFirst("第一颗子弹");
        stack.addFirst("第二颗子弹");
        stack.addFirst("第三颗子弹");
        stack.addFirst("第四颗子弹");*/
        System.out.println(stack);//[第四颗子弹, 第三颗子弹, 第二颗子弹, 第一颗子弹]

        //出栈
        System.out.println(stack.pop());//第四颗子弹
        System.out.println(stack.pop());//第三颗子弹
        System.out.println(stack);
//        System.out.println(stack.removeFirst());//第四颗子弹
//        System.out.println(stack.removeFirst());//第三颗子弹
//        System.out.println(stack);//[第二颗子弹, 第一颗子弹]


    }
}
