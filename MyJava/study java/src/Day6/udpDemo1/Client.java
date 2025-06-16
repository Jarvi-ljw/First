package Day6.udpDemo1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws Exception {
        //目标：认识udp通信，了解创建客户端和服务端的方法
        System.out.println("---客户端启动了---");

        //创建客服端：系统随机分配一个端口号
        DatagramSocket socket =new DatagramSocket();


        //创建要发送的数据包
        String str="你好，我是客户端";
        DatagramPacket packet =new DatagramPacket(str.getBytes(),str.getBytes().length, InetAddress.getByName("127.0.0.1"),8080);

        //客户端发送数据
        socket.send(packet);

    }
}
