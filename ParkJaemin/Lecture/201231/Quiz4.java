import java.util.Random;

public class Quiz4 {
    public static void main(String[] args) {
        //a의 주사위와 b의 주사위를 만들고
        // 주사위를 각자 굴려서
        // 더 높은 숫자가 나온 사람이 이기게 만들어 보자!
        Random rand = new Random();

        int diceA = (int) (Math.random() * 6) + 1;
        int diceB = rand.nextInt(6) + 1;

        if (diceA > diceB) {
            System.out.printf("A 승리! %d vs %d\n", diceA, diceB);


        }
    }
}