package Day2.interface1;

public class interfaceDemo1 {
    //目标：认识接口，搞清楚接口的特点，基本使用
    //接口和抽象类一样也不能创建对象
    public static void main(String[] args) {
        System.out.println(A.SCHOOL_NAME);
        //接口是用来被类实现的
    }
}
//同样的实现类实现接口是类似继承的，实现接口同样来重写接口方法
class B implements A{
    @Override
    public void show() {
        System.out.println("B show");
    }

}
