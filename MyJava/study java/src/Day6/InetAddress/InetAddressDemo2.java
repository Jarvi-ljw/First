package Day6.InetAddress;

import java.net.InetAddress;

public class InetAddressDemo2 {
    public static void main(String[] args) {
        try {
            InetAddress ip1=InetAddress.getLocalHost();
            System.out.println(ip1.getHostName());//主机名
            System.out.println(ip1.getHostAddress());//主机地址

            InetAddress byName = InetAddress.getByName("www.baidu.com");//获取该域名下的InetAddress对象
            System.out.println(byName.getHostName());
            System.out.println(byName.getHostAddress());

            boolean reachable = ip1.isReachable(10);//判断主机再指定毫秒内与该ip对应的主机是否能连通
            System.out.println(reachable);

            boolean reachable1 = byName.isReachable(10);//false 10毫秒太过于小了，无法连接百度服务器
            System.out.println(reachable1);

            boolean isConnect = byName.isReachable(17);//true 最低17毫秒可以连接百度服务器（根据网速来的）
            System.out.println(isConnect);



        }catch (Exception e){
            e.printStackTrace();

        }

    }
}
