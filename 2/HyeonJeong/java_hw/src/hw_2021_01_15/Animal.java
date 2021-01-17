package hw_2021_01_15;

public class Animal {
    protected int age;
    protected String food, crying_sound;

    public Animal(int age, String food, String crying){
        this.age = age;
        this.food = food;
        this.crying_sound = crying;
    }

    public static void main(String[] args) {
        Parrot pa = new Parrot(
                2, "모이", "짹짹", 2, "무지개색");

        pa.eat();
        pa.crying();
        pa.walk();

        Tiger ti = new Tiger(
                5, "고기", "어흥", "줄무늬");

        ti.eat();
        ti.crying();
        ti.walk();

        Monkey mo = new Monkey(
                12, "바나나", "우끼끼", "빨간색");

        mo.eat();
        mo.crying();
        mo.walk();
    }

}
