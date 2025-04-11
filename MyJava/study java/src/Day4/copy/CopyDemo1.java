package Day4.copy;

import java.io.*;

public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        //创建文件字节输入流管道
        InputStream is =new FileInputStream("F:\\mysql-connector-j-9.1.0.jar");

        //创建字节数组读取该路径下的所有文件
        byte[] bytes =is.readAllBytes();

        //创建文件字节输出流管道
        OutputStream os =new FileOutputStream("F:\\Test\\mysql-connector-j-9.1.0.jar");
        os.write(bytes);
        System.out.println("复制成功");

        is.close();
        os.close();
    }
}
