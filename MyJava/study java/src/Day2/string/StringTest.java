package Day2.string;

public class StringTest {
    public static void main(String[] args) {
        //生成4位验证码
        String code = getCode(4);
        System.out.println(code);
    }
    public static String getCode(int n){
        //生成一个随机位数的验证码
        // 1.定义一个字符串，包含0-9,a-z,A-Z
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        //2.定义一个空的字符串来存储验证码
        String code="";
        //3.循环n次，生成n位验证码
        for (int i = 0; i < n; i++) {
            //4.从str中随机获取一个字符
            int index = (int)(Math.random()*str.length());
            //5.把字符拼接到code中
            code += str.charAt(index);
        }
        return code;
    }
}
