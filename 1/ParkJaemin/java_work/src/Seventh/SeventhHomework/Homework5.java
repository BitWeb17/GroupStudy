package Seventh.SeventhHomework;

public class Homework5 {
    public static void main(String[] args) {
        Number E = new Number();

        for (int i = 3; i <= 33; ++i) {
            if (i % 2 == 0 || i % 3 == 0) {
                E.sum = i;
                System.out.println(" 3부터 33까지 숫자중 2의 배수 또는 3의 배수 " + E.sum);
            }
        }
    }
}
