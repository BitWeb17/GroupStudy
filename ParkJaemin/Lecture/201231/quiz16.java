import java.util.Random;

public class quiz16 {
    public static void main(String[] args) {
        //주사위를 10 번 굴려서 홀수는 더하고 짝수는 뺀다.
        //10번 굴린 이후의 주사위 눈금을 구하도록 프로그래밍 해보자!
        //(주사위 눈금의 총합을 구하면 된다)
        int addsum = 0, subsum = 0;
        int dice=0;
        for (dice=0; dice<10 ; ++dice ) {
            Random rand = new Random();

            int randNum = rand.nextInt(6) + 1;
            System.out.println("1 ~ 6까지 주사위 굴리기 " + randNum);


            if (randNum % 2 == 0) {
                subsum -= randNum;
                System.out.println("짝수 입니다." + subsum);

            } else{
                addsum += randNum;
                System.out.println("홀수 입니다." + addsum);
            }

            }
            System.out.println(" 최종결과 "  +  (addsum+subsum));
        }

        }




