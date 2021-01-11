package Eighth;

class Delivery {
    int purposeNum = 3000;
    int sum = 0;
    int cnt = 0;

    public void factory_A() {
        sum += 100; // 10 hours
    }

    public void factory_B() {
        sum += 50; // 20 hours
    }

    public void operateA(int day) {

        for (int i = 0; i < 24; i++) {
            factory_A();
        }
    }

    public void operateB(int day) {

        for (int i = 0; i < day; i++) {
            factory_B();
        }
    }

    public void printSum() {

    }
}

public class Homework12 {
    public static void main(String[] args) {

    }
}
