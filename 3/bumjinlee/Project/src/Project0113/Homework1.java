package Project0113;

class Parent {
    private String human;
    private String animal;

    public Parent(String hu, String ani) {
        this.human = hu;
        this.animal = ani;
    }

    public String getHuman() {
        return human;
    }

    public String getAnimal() {
        return animal;
    }

    @Override
    public String toString() {
        return
                "동물은='" + getHuman() + '\'' + "인가" +
                ", 사람은='" + getAnimal() + '\'' + "인가";
    }
}

class Child extends Parent {
    private String person;


    public Child(String hu, String an, String ps) {
        super(hu, an);
        this.person = ps;
    }

    @Override
    public String toString() {
        return person;
    }
}

public class Homework1 {
    public static void main(String[] args) {
        Parent p = new Parent("사람", "동물");
        System.out.println(p);

        Child s = new Child("사람", "동물" , "사람은 동물이다");
        System.out.println(s);
    }
}
