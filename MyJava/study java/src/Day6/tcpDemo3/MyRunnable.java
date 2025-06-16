package Day6.tcpDemo3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class MyRunnable implements Runnable{
   private Socket accept;

   public MyRunnable(Socket accept){
       this.accept=accept;
   }
    @Override
    public void run() {
       try {
           //获取输入流，得到客户端发来的消息
           InputStream is =accept.getInputStream();

           //将输入流包装成特殊流
           DataInputStream dis=new DataInputStream(is);

           while (true) {
               //读取数据
               String str=dis.readUTF();

               //输出数据
               System.out.println("----------------------------------------------------");
               System.out.println("客户端发送的文字为:"+str);
               System.out.println("客户端的ip地址为"+accept.getInetAddress().getHostAddress());
               System.out.println("客户端的端口为:"+accept.getPort());
               System.out.println("----------------------------------------------------");
           }
       }catch (Exception e){
           System.out.println("一个客户端下线了，"+"ip:"+accept.getInetAddress().getHostAddress()+"，端口为:"+accept.getPort());
       }

    }
}
