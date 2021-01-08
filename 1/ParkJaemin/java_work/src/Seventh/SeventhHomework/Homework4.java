package Seventh.SeventhHomework;

public class Homework4 {
    public static void main(String[] args) {
       Number D = new Number();

        for (int i = 1; i <= 20; ++i) {
            if (i % 2 == 0 && i % 3 == 0) {
                D.sum = i;
                System.out.println(" 1부터 20까지 숫자중 2의 배수이면서 3의 배수 " + D.sum);
            }
        }

//              Number5 E = new Number5();
//
//        for (int i = 3; i <= 33; ++i) {
//            if (i % 2 == 0 || i % 3 == 0) {
//                E.sum = i;
//                System.out.println(" 3부터 33까지 숫자중 2의 배수 또는 3의 배수 " + E.sum);
//            }
//        }
    }
}
