package Day2.abstract1;
///一个类继承抽象类，必须重写所有的抽象方法或者再定义成抽象类
public class B extends A{
    @Override
    public void show() {
        System.out.println("重写A中的show方法");
    }
    //继承了抽象类后可以使用父类的属性和方法
    public static void main(String[] args) {
        B b = new B();
        b.setName("张三");
    }
}
