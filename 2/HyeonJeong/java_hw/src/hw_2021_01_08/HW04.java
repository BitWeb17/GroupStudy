package hw_2021_01_08;

public class HW04 {
    public static void main(String[] args) {
        final int PLAYERS = 5;
        final int DICES = 3;
        final int FACES = 6;
        DiceGames dg = new DiceGames(PLAYERS, DICES, FACES);

        for(int i = 0; i < PLAYERS; i++) {
            dg.rollDice(i);
            System.out.printf("player%d의 눈금합: %d\n", i, dg.getDiceSum(i));
        }
        System.out.printf("\n가장 큰 주사위값은? %d\n", dg.getBiggestNum());
    }
}
