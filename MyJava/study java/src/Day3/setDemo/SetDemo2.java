package Day3.setDemo;

import java.util.HashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        //目标：实现HashSet集合去重操作
        Student student1 = new Student("张三",18,"北京","123456789");
        Student student2 = new Student("李四",19,"上海","8132712371");
        Student student3 = new Student("张三",18,"北京","123456789");
        Student student4 = new Student("李四",19,"上海","8132712371");

        HashSet<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        System.out.println(students);
    }
}
