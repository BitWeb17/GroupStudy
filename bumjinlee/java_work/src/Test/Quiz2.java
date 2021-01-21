package Test;

import java.util.Scanner;

class Average {
    Scanner scan = new Scanner(System.in);

    public Average() {

        int[] score = new int[3];
        int sum = 0;

        System.out.println("평균을 구하고 싶은 3개의 숫자를 입력해 주세요.");

        for (int i = 0; i < score.length; i++) {

            score[i] = scan.nextInt();
            sum += score[i];
        }
        System.out.print("3개 숫자 평균 = " + sum / score.length);
    }
}

public class Quiz2 {
    public static void main(String[] args) {

        Average qz2 = new Average();
    }
}