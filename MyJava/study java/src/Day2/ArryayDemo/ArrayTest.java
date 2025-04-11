package Day2.ArryayDemo;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 13, "男");
        Student stu2 = new Student("王林", 15, "男");
        Student stu3 = new Student("李四", 10, "男");
        Student[] arr = {stu1, stu2, stu3};




      /*  //匿名内部类
        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2){
                return  o1.getAge()- o2.getAge();
            }
        });*/

        //lambda
//        Arrays.sort(arr, (o1, o2) -> {
//            return o1.getAge() - o2.getAge();
//        });

               // Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());
        Arrays.sort(arr,Student::compare);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("按年龄三位同学排序后的结果为:");
            Student students = arr[i];
            System.out.println(students);
        }
    }
}
