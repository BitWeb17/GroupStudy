import java.util.Random;

public class Quiz15 {
    public static void main(String[] args) {
        //  9-3 먼저 무한루프에서 주사위가 굴러가도록 만든다
        int dicesum = 0;
        for (dicesum=0; dicesum<10 ; dicesum++ ) {
            Random rand = new Random();

            int randNum = rand.nextInt(6) + 1;
            System.out.println("1 ~ 6까지 주사위 굴리기 " + randNum);

            if (randNum % 2 == 0) {
                dicesum -= randNum;
                System.out.println("짝수 입니다." + randNum);

            } else {
                dicesum += randNum;
                System.out.println("홀수 입니다." + randNum);


            }
        }
        System.out.println(" 최종결과 "  +  dicesum);
    }
}