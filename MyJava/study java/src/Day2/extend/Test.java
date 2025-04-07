package Day2.extend;
//方法重写
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

    }
}
    class Animal {
        //方法重写:方法名称、参数列表、返回值类型相同
        public void eat() {
            System.out.println("动物会吃饭");
        }
    }

    class Dog extends Animal {
        @Override//方法重写的校验注释（标志），要求方法名称、参数列表、返回值类型相同
        public void eat() {
            System.out.println("狗吃骨头");
        }
    }


