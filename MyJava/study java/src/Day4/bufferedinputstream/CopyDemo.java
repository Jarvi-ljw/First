package Day4.bufferedinputstream;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        //创建文件字节输入流管道
        InputStream is =new FileInputStream("study java\\src\\Day4\\practiceFileWriter.txt");

        //将低级的字节输入流管道包装成高级的缓存字节输入流
        InputStream bis =new BufferedInputStream(is);

        //创建文件字节输出流管道
        OutputStream os =new FileOutputStream("study java\\src\\Day4\\bufferedinputstream\\test.txt");

        //将低级的字节输出流管道包装成高级的缓存字节输出流
        OutputStream bos =new BufferedOutputStream(os);

        //创建字节数组读取该路径下的所有文件
        byte[] bytes =new byte[1024];
        //定义len来记录每次读取的字节的个数
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);//每次写入读取到的长度
        }

        System.out.println("复制成功");

        bos.flush();
    }
}
