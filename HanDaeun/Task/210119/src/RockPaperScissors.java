public class RockPaperScissors {
    private final String ROCK = "바위";
    private final String PAPER = "보";
    private final String SCISSORS = "가위";
    private final String START = "가위바위보 중 하나를 입력해주세요!";
    private final String P1WIN = "플레이어1이 이겼습니다!!";
    private final String P2WIN = "플레이어2가 이겼습니다!!";
    private final String TIE = "비겼습니다!!";
    private final String ERROR = "가위바위보도 제대로 입력을 못하시는군요ㅜㅜ";
    private String msg;

    public void setRpsStart() {
        msg = START;
    }

    public void rpsPlay(String p1, String p2) {
        // 플레이어1이 이기는 경우 (바위-가위 | 보-바위 | 가위-보)
        if((p1.equals(ROCK) && p2.equals(SCISSORS)) ||
                (p1.equals(PAPER) && p2.equals(ROCK)) ||
                (p1.equals(SCISSORS) && p2.equals(PAPER))) {
            msg = P1WIN;
        }
        // 플레이어2가 이기는 경우 (바위-보 | 보-가위 | 가위-바위)
        else if((p1.equals(ROCK) && p2.equals(PAPER)) ||
                (p1.equals(PAPER) && p2.equals(SCISSORS)) ||
                (p1.equals(SCISSORS) && p2.equals(ROCK))) {
            msg = P2WIN;
        }
        // 비기는 경우 (바위-바위 | 보-보 | 가위-가위)
        else if((p1.equals(ROCK) && p2.equals(ROCK)) ||
                (p1.equals(PAPER) && p2.equals(PAPER)) ||
                (p1.equals(SCISSORS) && p2.equals(SCISSORS))) {
            msg = TIE;
        }
        // 누군가가 잘못 입력한 경우
        else {
            msg = ERROR;
        }
    }

    public String getMsg() {
        return msg;
    }

    public String getSTART() {
        return START;
    }
}