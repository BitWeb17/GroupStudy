package hw_2021_01_15;

public class Monkey extends Animal implements Behavior{
    private String hip;

    public Monkey(int age, String food, String crying, String hip) {
        super(age, food, crying);
        this.hip = hip;
    }

    public String getHip() {
        return hip;
    }

    @Override
    public void eat() {
        System.out.printf("원숭이는 %s를 먹는다.\n",food);

    }

    @Override
    public void walk() {
        System.out.printf("원숭이는 %s엉덩이를 씰룩거리며 걷는다.\n",hip);
    }

    @Override
    public void crying() {
        System.out.printf("원숭이가 %s하며 운다.\n",crying_sound);

    }
}
