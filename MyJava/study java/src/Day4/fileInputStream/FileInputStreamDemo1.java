package Day4.fileInputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：认识文件字节输入流

        //1.创建文件字节输入流管道于源文件接通
        //InputStream is =new FileInputStream(new File("\\Day4\\fileInputStream\\ljw.txt"));
        InputStream is =new FileInputStream("F:\\Github\\First\\MyJava\\study java\\src\\Day4\\fileInputStream\\ljw.txt");

        //2.开始读取文件的字节并输出,每次读取一个字节
        //定义变量记录读取字节
        int readByte;
       while ((readByte=is.read())!=-1){
           System.out.print((char)readByte);
       }
       is.close();
    }
}
