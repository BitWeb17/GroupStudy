import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MathRandom {
    public static void main(String[] args) {
        int randNum = (int) Math.random();

        System.out.println("임의의 랜덤 숫자=" + randNum);
        // 이 결과는 계속 0이 나올 것이다.
        // 왜? 0.0 ~1.0 사이의 값이 나오기 떄문이다.

        randNum = (int)(Math.random()*6)+1;
        System.out.println("0~10 사이의 랜덤숫자 = " + randNum);
    }
}
