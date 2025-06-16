package Day4.filewrite;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo1 {
    public static void main(String[] args) {
        try (
                Writer writer = new FileWriter(("study java\\src\\Day4\\practiceFileWriter.txt"));

        )
        {
            writer.write("a");
            writer.write(98);//‘b'
            writer.write('中');
            writer.write("ljw",1,2);
            //换行
            writer.write("\r\n");
            writer.write("中国");
            writer.write("java是一门编程语言".toCharArray());

            //刷新流
            writer.flush();
            //关闭资源,包含了刷新
            writer.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
