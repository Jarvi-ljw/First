package Day4.bufferedReader;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        //创建输入、输出管道

        try (
                Reader fr = new FileReader("study java\\src\\Day4\\practiceFileWriter.txt");
                Writer fw = new FileWriter("study java\\src\\Day4\\bufferedReader\\abc.txt");

        ) {
            //创建两个缓存字符流管道
            BufferedReader bfr = new BufferedReader(fr);
            BufferedWriter bfw = new BufferedWriter(fw);

            /*char[] buffer =new char[1024];
            int len;
            while ((len=bfr.read(buffer))!=-1){
                String str =new String(buffer,0,len);
                bfw.write(str);*/

            //bufferedReader新增按行读取的方法
            String line;
            while ((line = bfr.readLine() )!= null) {
                bfw.newLine();//换行
                bfw.write(new String(line));

            }
            bfw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
