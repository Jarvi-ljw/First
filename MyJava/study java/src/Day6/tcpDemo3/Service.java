package Day6.tcpDemo3;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class Service {
    public static void main(String[] args) throws Exception{
        System.out.println("=====服务端启动了=====");
        //tcp通信服务端的多发多收,支持多客户端开发
        ServerSocket socket =new ServerSocket(8080);

        //创建线程池
        ExecutorService pool=new ThreadPoolExecutor(3,3,1, TimeUnit.DAYS,new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        while (true) {
            //阻塞等待客户端的连接请求，一旦与某个客户端成功连接，则返回服务端这边的socket对象
            Socket accept = socket.accept();
            System.out.println("一个客户端上线了"+"ip:"+accept.getInetAddress().getHostAddress()+"端口为:"+accept.getPort());

            //创建target任务并获取accept连接给runnable任务
            MyRunnable target =new MyRunnable(accept);
            //处理runnable任务
            pool.execute(target);
        }


    }
}
