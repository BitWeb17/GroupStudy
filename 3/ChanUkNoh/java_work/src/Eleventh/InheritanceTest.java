package Eleventh;

class Student2 extends Person2 {
    private String major;

    public Student2(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }
}

class Person2 {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Person2 p = new Person2("Tom", 33);
        System.out.println(p);
    }
}
