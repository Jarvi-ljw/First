package Day7.Junit;

import org.junit.Test;
//使用Junit进行单元测试，需要做到:
//1. 导入Junit的jar包
//2. 创建测试类，并使用@Test注解标注测试方法
//3.测试类的测试方法必须是公共，无返回值，无参数
public class JunitTest {

    @Test
    public void eatTest()
    {
        Dog dog=new Dog("旺财", 3);
        dog.eat();
    }
}
