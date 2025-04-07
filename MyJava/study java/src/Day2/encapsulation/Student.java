package Day2.encapsulation;

//类的封装
public class Student {

    private String name;
    private int age;

    public Student(){

    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if (age<0||age>100){
            System.out.println("年龄不合法");
        }else {
            this.age=age;
        }
    }

    public int getAge(){
        return this.age;
    }

}
