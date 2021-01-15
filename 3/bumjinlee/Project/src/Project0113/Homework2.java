package Project0113;

class Car {
    private String car;
    private String airplain;

    public Car(String ca, String ai) {
        this.car = ca;
        this.airplain = ai;
    }

    public String getCar() {
        return car;
    }

    public String getAirplain() {
        return airplain;
    }

    @Override
    public String toString() {
        return
                "자동차는='" + getCar() + '\'' + "인가" +
                        ", 사람은='" + getAirplain() + '\'' + "인가";
    }
}

class Air extends Car {
    private String person;


    public Air(String ca, String ai, String ps) {
        super(ca, ai);
        this.person = ps;
    }

    @Override
    public String toString() {
        return person;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Car p = new Car("차", "비행기");
        System.out.println(p);

        Air s = new Air("차", "비행기" , "못탄");
        System.out.println(s);
    }
}
