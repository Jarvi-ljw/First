package Day6.InetAddress;

import java.net.InetAddress;

public class InetAddressDemo1 {
    public static void main(String[] args) {
        try {
            InetAddress ip1=InetAddress.getLocalHost();//获取本机的主机包含主机名和ip地址
            System.out.println(ip1);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
