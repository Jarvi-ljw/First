package Day2.interface1;
//接口:使用interface关键字定义的
public interface A {
    //jdk8之前，接口只能定义常量和抽象方法
    String SCHOOL_NAME = "张三";

    //抽象方法：接口定义的抽象方法可以省略abstract关键字
    //public abstract void show();
    void show();
}
