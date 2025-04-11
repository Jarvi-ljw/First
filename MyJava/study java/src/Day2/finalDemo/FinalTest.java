package Day2.finalDemo;

public class FinalTest {
    public static void main(String[] args) {
        //final修饰的类是不能被继承的

        //final修饰的方法是不能被重写的

        //final修饰的变量只能修改一次
        Fu fu = new Fu();
        //fu.age=20;
        String name = fu.NAME;
        System.out.println(name);
    }
}
