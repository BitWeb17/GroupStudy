import java.util.Random;

public class Randominst {
    public static void main(String[] args) {
        // 우선은 사용법 위주로 보면 됨.
        Random rand = new Random(); // 스캐너랑 비슷한 개념


        // bound는 범위의 개수를 지정하는 녀석임
        // 입력할 필요가 없으며 자동완성 기능으로 나타나는 것
        int randNum = rand.nextInt(2);
        System.out.println("0~1까지 2개의 값을 뽑아요 : " + randNum);

        randNum = rand.nextInt(6);
        System.out.println("0~5까지 6개의 값을 뽑아요 : " + randNum);

        // 왜? rand.nextInt(6) + 1 이 1~6까지가 되나요?
        // rand.nextInt(6)의 범위가 0~5개로 6개
        // 0~5 전체에 1을 더하면?
        // 1~6
        randNum = rand.nextInt(6) + 1;
        System.out.println("1~6까지 6까지 주사위 굴리기 : " + randNum);
        // -----------------------------------------------------------------
        randNum = (int) (Math.random()*10);
        System.out.println("0~9사이의 랜덤숫자 : " + randNum);

        randNum = (int) (Math.random()*2);
        System.out.println("0~1사이의 랜덤숫자 : " + randNum);

        randNum = (int) (Math.random()*6) + 1 ;
        System.out.println("주사위를 굴리자 : " + randNum);

    }
}
