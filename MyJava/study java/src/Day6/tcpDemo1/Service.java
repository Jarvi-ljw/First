package Day6.tcpDemo1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
    public static void main(String[] args) throws Exception{
        System.out.println("=====服务端启动了=====");
        //tcp通信服务端的创建和运用，实现一发一收
        ServerSocket socket =new ServerSocket(8080);

        //阻塞等待客户端的连接请求，一旦与某个客户端成功连接，则返回服务端这边的socket对象
        Socket accept = socket.accept();

        //获取输入流，得到客户端发来的消息
        InputStream is =accept.getInputStream();

        //将输入流包装成特殊流
        DataInputStream dis=new DataInputStream(is);

        //读取数据
        int id=dis.readInt();
        String str=dis.readUTF();

        //输出数据
        System.out.println("客户端id为:"+id);
        System.out.println("客户端发送的文字为:"+str);
        System.out.println("客户端的ip地址为"+accept.getInetAddress().getHostAddress());
        System.out.println("客户端的端口为:"+accept.getPort());

        //关闭资源
        socket.close();
    }
}
