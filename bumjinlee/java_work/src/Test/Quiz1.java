package Test;

import java.util.Scanner;

class Number {
    Scanner scan = new Scanner(System.in);

    public Number() {

        System.out.print("아무 숫자를 입력하세요: ");
        int num = scan.nextInt();
        System.out.println("입력된 숫자 = " + num);

    }
}

public class Quiz1 {
    public static void main(String[] args) {

        Number qz1 = new Number();
    }
}
