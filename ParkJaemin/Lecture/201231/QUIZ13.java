import sun.awt.SunToolkit;

import java.util.Random;

public class QUIZ13 {
    public static void main(String[] args) {
    for(;;){
        Random rand = new Random();
        // 9-1 먼저 주사위 눈금을 출력하도록 프로그래밍
        int randNum = rand.nextInt(6)+1;
        System.out.println("1 ~ 6까지 주사위 굴리기 " + randNum);

        if(randNum % 2==0){
            System.out.println("짝수 입니다.");

        } else{
            System.out.println("홀수 입니다.");
        }
        }
    }
}
