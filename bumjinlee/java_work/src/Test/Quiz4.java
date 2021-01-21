package Test;

import java.util.Scanner;

class RPSGame {

    Scanner scan;

    final int SCISSORS = 1;
    final int ROCK = 2;
    final int PAPER = 3;

    int computer;
    int player;

    public void RPSGame() {
        scan = new Scanner(System.in);
    }

    public void play() {
        computer = (int) (Math.random() * 3) + 1;
        System.out.print("가위 : 1 , 바위 : 2 , 보 : 3 중 원하는 숫자를 입력하세요: ");
        player = scan.nextInt();

        if (player == computer) {

            System.out.println("무승부입니다.");
        } else if (player == SCISSORS && computer == PAPER) {
            System.out.println("플레이어 승!");
        } else if (player == ROCK && computer == SCISSORS) {
            System.out.println("플레이어 승!");
        } else if (player == PAPER && computer == ROCK) {
            System.out.println("플레이어 승!");
        } else {
            System.out.println("컴퓨터 승!");
        }
        System.out.println("컴퓨터 = " + computer);
        System.out.println("사용자 = " + player);
    }

}


public class Quiz4 {
    public static void main(String[] args) {
        RPSGame rpsg = new RPSGame();

        rpsg.RPSGame();
        rpsg.play();

    }
}
