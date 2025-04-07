package Day2.abstract1;

public abstract class A {
    private String name;
    private int age;

    public A() {
    }

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void show();

    public void show1(){
        System.out.println("show1");
    }
}
