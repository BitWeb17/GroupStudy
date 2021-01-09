package Eighth.Homework;
//주사위 게임을 한다.
//   5명의 플레이어가 있다.
//   이들은 모두 3개의 주사위를 가지고 있다.
//   3개의 주사위를 굴려서 합산 결과가 가장 큰 사람이 이긴다.
//   (숫자 6은 0 으로 무효화 된다)
//   프로그램으로 이를 만들어보자!
class DicePlayer {
    int[] player;
    int diceONE;
    int diceTwo;
    int diceThree;
    int diceSum;
    int playerNum;


    public DicePlayer(int playerNum) {

     player= new int[playerNum];

        for (int i = 1; i <= playerNum; i++) {


            System.out.print(i + " Player :");
            diceONE = ((int) (Math.random() * 6) + 1);
            diceTwo = ((int) (Math.random() * 6) + 1);
            diceThree = ((int) (Math.random() * 6) + 1);
            System.out.printf("Dice Number = %d,%d,%d\n", diceONE, diceTwo, diceThree);
            diceSum = diceONE + diceTwo + diceThree;
            System.out.println("sum = " + diceSum);


        }

    }

    public void sixDice () {
        for (int i = 1; i <= playerNum; i++) {
            diceONE = ((int) (Math.random() * 6) + 1);
            diceTwo = ((int) (Math.random() * 6) + 1);
            diceThree = ((int) (Math.random() * 6) + 1);

        }

    }
}

public class Homework04 {
    public static void main(String[] args) {
        DicePlayer dp = new DicePlayer(5);

    }
}
