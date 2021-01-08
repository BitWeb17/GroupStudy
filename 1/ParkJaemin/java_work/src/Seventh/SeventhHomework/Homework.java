package Seventh.SeventhHomework;

public class Homework {
    public static void main(String[] args) {
        Number A = new Number();

        for (int i = 0; i < 10; i++) {
            A.sum = A.num++ + 1;

            A.getSum();

            System.out.println(" 1부터 10까지 나열 " + A.sum);
        }
    }
}
