package Day2.ArryayDemo;

public class Student {
    private String name;
    private int age;
    private String gender;

    public Student(){

    }

    public Student(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender=gender;
    }


    public static int compare(Student o1,Student o2){
        return o1.getAge()- o2.getAge();
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
