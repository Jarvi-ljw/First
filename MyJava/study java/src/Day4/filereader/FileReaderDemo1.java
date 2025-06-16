package Day4.filereader;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) {
        //1.创建文件字符输入流管道
        try (
                Reader reader =new FileReader("study java\\src\\Day4\\OutputStreamPractice.txt");
                ){
            //定义字符数组存储读取的字符
            char[] buffer =new char[1024];//每次读取1024个字符


            int len;//用于记录每次读取的个数
            while ((len=reader.read(buffer))!=-1){
                //将每次读取到的字符打印出来
                String str =new String(buffer,0,len);
                System.out.println(str);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
