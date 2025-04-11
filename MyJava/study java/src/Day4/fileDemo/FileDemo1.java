package Day4.fileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        //用绝对路径创建对象：
        //绝对路径带盘符
        File file = new File("F:\\Elsa林\\1\\HU74.tar");
        System.out.println(file.length());//字节个数:2262507520
        System.out.println(file.getName());//HU74.tar
        //  System.out.println(file.isFile());//true
        // System.out.println(file.isDirectory());//false

        //也可以用相对路径创建对象
        //相对路径一般是工程下的一个文件
        File file2 = new File("F:\\Github\\First\\MyJava\\study java\\src\\Day4\\fileDemo\\e324683e3c2ee5d33147eedd4666c114.png");
        //System.out.println(file2.length());

        //创建一个文件不存在的对象
        File file3 =new File("F:\\abc.txt");
        //System.out.println(file3.exists());
       // System.out.println(file3.createNewFile());

        //创建一个不存在的文件夹对象
        File file4 =new File("F:\\java创建出来的文件夹");
        //System.out.println(file4.mkdir());//只能创建一级文件夹
        //System.out.println(file4.delete());

        //创建多级文件夹
        File file5 =new File("F:\\java创建出来的文件夹\\666");
        //System.out.println(file5.mkdirs());
        //System.out.println(file5.delete());

        //获取一级文件夹的所有文件名
      /*  File file6 =new File("F:\\");
        String[] names=file6.list();
       for (String name:names){
           System.out.println(name);
       }*/

       //获取一级文件夹的所有文件对象
        File file7 =new File("F:\\");
       File[] file8 =file7.listFiles();
       for (File files:file8){
           System.out.println(files.getAbsoluteFile());
       }

        /*File deleteFile =new File("C:\\Users\\Public\\Desktop\\鸣潮.lnk");
        System.out.println(deleteFile.exists());
        System.out.println(deleteFile.delete());*/


    }
}
