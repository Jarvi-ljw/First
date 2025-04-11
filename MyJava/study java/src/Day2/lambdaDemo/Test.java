package Day2.lambdaDemo;

public class Test implements Usb{
    //正常情况下要调用接口中的方法该类必须继承接口且重写接口中的方法。
    @Override
    public  void start() {
        System.out.println("usb接口的方法被重写了");
    }

    public static void main(String[] args) {
        //本类中调用重写的接口方法：1.创建本类的对象，2.调用方法
        Test test =new Test();
        test.start();

        // 使用匿名内部类可以不继承接口的前提下重写方法。
        Usb usb =new Usb() {
            @Override
            public void start() {
                System.out.println("usb开始工作");
            }
        };
        usb.start();//重写的方法调用

        Usb usb1 =()->{
            System.out.println("使用lambda表达式");
        };
        usb1.start();

        //只有函数式接口(只有一个方法)才能使用lambda表达式
  /*     Animal a = ()->{
           System.out.println("使用lambda表达式");
       }*/

        //抽象类不能直接实例化，想要调用抽象类的抽象方法要定义一个子类（实现类）来实现抽象类的抽象方法
       //Animal a =new Animal() ;


        //如果不重写实现类，则直接调用父类的方法体
        Cat cat =new Cat();
        cat.eat();

        //重写父类的所有方法，即可调用父类的方法体
        Dog dog = new Dog();
        dog.eat();

        //没有子类继承抽象方法想要调用抽象方法的话，可以使用匿名内部类
        //匿名内部类实际上就是一个子类，继承Usb的一个子类，同样也是一个子类对象
        Usb usb2 =new Usb(){
            @Override
            public void start(){
                System.out.println("匿名内部类");
            }
        };
        usb2.start();
    }



}

@FunctionalInterface
interface Usb{
     void start();
}
abstract class Animal {
    public void eat(){
        System.out.println("动物吃东西");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}

class  Cat extends Animal{
}

