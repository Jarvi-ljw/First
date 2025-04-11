package Day4.recursionDemo;

import java.util.Arrays;

public class Charset {
    public static void main(String[] args) throws Exception {
        String name ="中国牛逼666";

        //对name进行编码
        byte[] bytes =name.getBytes();//UTF-8编码的
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        byte[] byte1 =name.getBytes("GBK");
        System.out.println(byte1.length);
        System.out.println(Arrays.toString(byte1));


        //对name解码
        String getByte =new String(byte1,"GBK");
        System.out.println(getByte);
    }
}
