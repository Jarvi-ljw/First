package Day2.Staticfiled;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(Student.name="张三");//张三

        s1.name="李四";
        s2.name="王五";

        System.out.println(s1.name);//王五
        System.out.println(s2.name);//王五


    }
    //静态变量可以理解为类变量，类变量属于类，不属于对象，所有对象共享。类似学生与班级的关系。
}
