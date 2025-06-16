package Day6.tcpDemo2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {


        //实现tcp通信的多发多收
        System.out.println("=====客户端启动了=====");

        //认识tcp通信，了解如何创建客户端
        Socket socket = new Socket("127.0.0.1", 8080);

        //从socket通信管道中得到一个字节输出流
        OutputStream os = socket.getOutputStream();

        //将字节输出流包装成特殊流
        DataOutputStream dos =new DataOutputStream(os);

        while (true) {
            //获取用户输入
            Scanner sc =new Scanner(System.in);
            System.out.println("请输入id：");
            int id=sc.nextInt();
            dos.writeInt(id);
            System.out.println("请输入你要说的话:");
            String str =sc.next();
            if (str.equals("exit")){
                System.out.println("客户端登出，感谢您的使用！");
                socket.close();
                sc.close();
                break;
            }
            dos.writeUTF(str);

            dos.flush();//刷新管道，接第二个数据

        }


    }

}
