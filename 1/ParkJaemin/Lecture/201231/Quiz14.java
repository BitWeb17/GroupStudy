import java.util.Random;

public class Quiz14 {
    public static void main(String[] args) {
        //  9-3 먼저 무한루프에서 주사위가 굴러가도록 만든다
        int i = 0;
        for (; ; ) {
            Random rand = new Random();
            // 9-1 먼저 주사위 눈금을 출력하도록 프로그래밍
            int randNum = rand.nextInt(6) + 1;
            System.out.println("1 ~ 6까지 주사위 굴리기 " + randNum);
            //  9-2 주사위 눈금이 홀수인지 판정해본다.
            if (randNum % 2 == 0) {
                System.out.println("짝수 입니다."  + randNum);
                break;
            } else {
                System.out.println("홀수 입니다." + randNum);




            }
        }
    }
}