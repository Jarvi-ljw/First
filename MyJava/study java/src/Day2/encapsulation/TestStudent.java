package Day2.encapsulation;

public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        System.out.println("学生的姓名是"+student.getName());
        System.out.println("学生的年龄是"+student.getAge());
    }
}
