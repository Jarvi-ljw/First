package Day6.tcpDemo1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        //实现tcp通信的一发一收
        System.out.println("=====客户端启动了=====");
        //认识tcp通信，了解如何创建客户端
        Socket socket = new Socket("127.0.0.1", 8080);

        //从socket通信管道中得到一个字节输出流
        OutputStream os = socket.getOutputStream();

        //将字节输出流包装成特殊六
        DataOutputStream dos =new DataOutputStream(os);
        dos.writeInt(1);
        dos.writeUTF("你好啊，我是tcp通信客户端");

        //关闭资源
        socket.close();

    }

}
