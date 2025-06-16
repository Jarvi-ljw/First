package Day6.udpDemo1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Service {
    public static void main(String[] args) throws Exception{
        System.out.println("---服务端启动了---");
        //创建服务端
        DatagramSocket socket=new DatagramSocket(8080);

        //服务端接收数据包：先创建数据包才能接收数据
        byte[] buf =new byte[1024];//先创建数据包存储的字节数组
        DatagramPacket packet =new DatagramPacket(buf,buf.length);

        //服务端接收数据
        socket.receive(packet);

        byte[] buff= packet.getData(); //获取数据包中的数据
        int len = packet.getLength();//获取数据的长度
        System.out.println(new String(buff,0,len));//将字节转换为字符串

        //获取接收到的客户端的ip地址和端口号
        System.out.println("ip地址为"+packet.getAddress());
        System.out.println("端口号为："+packet.getPort());



    }
}
