package Day4.fileoutputstreamDemo;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //1.创建文件字节输出流的管道与目标文件连通
        //OutputStream outputStream =new FileOutputStream("F:\\Github\\First\\MyJava\\study java\\src\\Day4\\OutputStreamPractice.txt");//覆盖管道
        OutputStream outputStream =new FileOutputStream("F:\\Github\\First\\MyJava\\study java\\src\\Day4\\OutputStreamPractice.txt",true);//真实管道，追加数据

        //写入单个字符
        outputStream.write('a');
        //换行
        byte[] str="\r\n".getBytes();
        outputStream.write(str);

        //写入多个字符
        byte[] bytes ={'a','b','c','d'};
        byte[] byte1 ="我爱你中国".getBytes();
        outputStream.write(bytes);
        //换行
        outputStream.write("\r\n".getBytes());
        outputStream.write(byte1);

        //关闭流
        outputStream.close();

    }
}
