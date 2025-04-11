package Day4.copy;

import java.io.*;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        //创建文件字节输入流管道
        InputStream is =new FileInputStream("F:\\mysql-connector-j-9.1.0.jar");

        //创建文件字节输出流管道
        OutputStream os =new FileOutputStream("F:\\Test\\mysql-connector-j-9.1.0.jar");

        //创建字节数组读取该路径下的所有文件
        byte[] bytes =new byte[1024];
        //定义len来记录每次读取的字节的个数
        int len;
        while ((len=is.read(bytes))!=-1){
            os.write(bytes,0,len);//每次写入读取到的长度
        }

        System.out.println("复制成功");

        is.close();
        os.close();
    }
}
