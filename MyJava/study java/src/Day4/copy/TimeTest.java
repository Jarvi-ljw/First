package Day4.copy;

import java.io.*;

public class TimeTest {
    private static final String FIRST_LOCATION ="F:\\崩铁\\StarRail_setup_1.5.2.exe";
    private static final String DEST_LOCATION ="F:\\JavaTest_CopyFile\\";
    public static void main(String[] args) {
        //copyFile1();太慢了，被淘汰
        copyFile2();
        copyFile3();
        copyFile4();

    }

    //用高级的缓冲字节流按字节数组读文件
    private static void copyFile4() {
        //获取开始时间
        long start =System.currentTimeMillis();
        try(
                InputStream inputStream =new FileInputStream(FIRST_LOCATION);
                InputStream bfi =new BufferedInputStream(inputStream);
                OutputStream outputStream =new FileOutputStream(DEST_LOCATION+"3.exe");
                OutputStream bfw =new BufferedOutputStream(outputStream);
        ){
            int len;
            byte[] buffer =new byte[1024];
            while ((len=bfi.read(buffer))!=-1){
                bfw.write(buffer,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        //获取结束时间
        long end =System.currentTimeMillis();
        System.out.println("本次复制用时:"+(end-start)/1000.0+"s");
    }

    //用高级的缓冲字节流一个一个读文件
    private static void copyFile3() {
        //获取开始时间
        long start =System.currentTimeMillis();
        try(
                InputStream inputStream =new FileInputStream(FIRST_LOCATION);
                InputStream bfi =new BufferedInputStream(inputStream);
                OutputStream outputStream =new FileOutputStream(DEST_LOCATION+"3.exe");
                OutputStream bfw =new BufferedOutputStream(outputStream);
        ){
            int len;
            while ((len=bfi.read())!=-1){
                bfw.write(len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        //获取结束时间
        long end =System.currentTimeMillis();
        System.out.println("本次复制用时:"+(end-start)/1000.0+"s");
    }



    //用低级的字节流管道按字节数组读文件
    private static void copyFile2() {
        //获取开始时间
        long start =System.currentTimeMillis();
        try(
                InputStream inputStream =new FileInputStream(FIRST_LOCATION);
                OutputStream outputStream =new FileOutputStream(DEST_LOCATION+"2.exe");
        ){
            int len;
            byte[] buffer =new byte[1024];
            while ((len=inputStream.read(buffer))!=-1){
                outputStream.write(buffer,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        //获取结束时间
        long end =System.currentTimeMillis();
        System.out.println("本次复制用时:"+(end-start)/1000.0+"s");
    }

    //用低级的字节流管道一个一个读文件
    public static void copyFile1(){
        //获取开始时间
        long start =System.currentTimeMillis();
        try(
                InputStream inputStream =new FileInputStream(FIRST_LOCATION);
                OutputStream outputStream =new FileOutputStream(DEST_LOCATION+"1.exe");
                ){
            int len;
            while ((len=inputStream.read())!=-1){
                outputStream.write(len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        //获取结束时间
        long end =System.currentTimeMillis();
        System.out.println("本次复制用时:"+(end-start)/1000.0+"s");
    }

}
