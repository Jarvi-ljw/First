package Day4.fileInputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        //目标：认识文件字节输入流

        //1.创建文件字节输入流管道于源文件接通
        //InputStream is =new FileInputStream(new File("\\Day4\\fileInputStream\\ljw.txt"));
        InputStream is = new FileInputStream("F:\\Github\\First\\MyJava\\study java\\src\\Day4\\fileInputStream\\ljw.txt");

        //2.开始读取文件的字节并输出,每次读取多个字节
        //定义数组记录一次读取几个字节
        byte[] bytes = new byte[3];

        int len;
        while ((len=is.read(bytes)) != -1) {
            //把读取到的字节数组转换为字符串
            String str = new String(bytes,0,len);
            System.out.print(str);
        }
        is.close();
    }
}
