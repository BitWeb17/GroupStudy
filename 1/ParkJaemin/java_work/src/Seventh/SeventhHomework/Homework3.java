package Seventh.SeventhHomework;

public class Homework3 {
    public static void main(String[] args) {

        Number C = new Number();

        for (int i = 1; i <= 20; ++i) {
            if (i % 2 == 0) {
                C.sum = i;
                System.out.println(" 1부터 20까지 숫자중 2의 배수 " + C.sum);
            }
        }


    }
}
