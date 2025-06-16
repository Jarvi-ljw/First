package Day6.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        //获取本地的时间
        Date time =new Date();
        System.out.println(time);

        //格式化想要的时间格式
        //使用SimpleDateFormat的API
        SimpleDateFormat  sdf  =new SimpleDateFormat("yyyy年MM月dd号 hh:mm:ss");
        String result = sdf.format(time);
        System.out.println(result);

    }
}
