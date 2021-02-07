public class DiceGame {
    private final String NAMEUNPUT = "";
    private final String GAMEINPUT = "주사위 게임에 참여하려면 y, 차례를 쉬려면 n을 입력하세요.";
    private int diceNum;
    private String msg;

    public void setNAMEUNPUT() {
        msg = NAMEUNPUT;
    }

    public void setGAMEINPUT() {
        msg = GAMEINPUT;
    }

    public void rollDice() {
        diceNum = (int)(Math.random() * 6) + 1;
    }

    public int getDiceNum() {
        return diceNum;
    }

    public String getGAMEINPUT() {
        return GAMEINPUT;
    }
}
