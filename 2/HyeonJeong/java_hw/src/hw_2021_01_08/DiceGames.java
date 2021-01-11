package hw_2021_01_08;

public class DiceGames {
    int[] arr_players;   // 주사위의 합산
    int[] arr_dices;     // 각 주사위의 눈금
    int num_players;
    int num_dices;
    int num_faces;

    public DiceGames(
            int number_of_players, int number_of_dices_per_player, int number_of_dicefaces) {
        this.num_players = number_of_players;
        this.num_dices = number_of_dices_per_player;
        this.num_faces = number_of_dicefaces;
        arr_players = new int[number_of_players];
        arr_dices = new int[number_of_players * number_of_dices_per_player];
    }

    public void rollDice(int player) {
        for(int i = 0; i < num_dices; i++) {
            arr_dices[num_dices * player + i]
                    = (int)(Math.random() * num_faces) + 1;
        }
    }

    public void rollDice2(int player) {
        for(int i = 0; i < 2; i++) {
            arr_dices[i] = (int)(Math.random() * num_faces) + 1;

            if(arr_dices[1] % 2 == 1) {
                arr_dices[1] = 0;
            }

            switch(arr_dices[1]) {
                case 2 :
                case 4 :
                case 6 :
                case 8 :
            }
        }
    }

    public int getDiceSum(int player) { // player starts from 1
        int diceSum = 0;
        for(int i = 0; i < num_dices; i++) {
            if( arr_dices[player * num_dices + i] < 6 ) {
                diceSum += arr_dices[player * num_dices + i];
            } //else {
                //System.out.printf(
                // "player%d.주사위%d(%d) 의 눈금은 %d이어서 패스함\n"
                // , player, i, (player - 1) * num_dices + i,
                // arr_dices[(player - 1) * num_dices + i]);
              //}
        }
        arr_players[player] = diceSum;
        return diceSum;
    }

    public int getBiggestNum() {
        int biggest = 0;
        int winner = 0;
        for(int i = 0; i < num_players; i++) {
            if(biggest < arr_players[i]) {
                biggest = arr_players[i];
            }
        }
        return biggest;
    }
}