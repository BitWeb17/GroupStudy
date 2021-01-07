class RandomNumber {

    final int MEMBER = 20;
    int[] randnum;

    public void setRandnum() {
        randnum = new int[MEMBER]; // 20개의 빈 배열 생성

        for(int i =0; i < MEMBER; i++) {
            randnum[i] = (int)(Math.random() * 20) + 1;
            // 사원0 = 랜덤숫자, 사원1 = 랜덤숫자...사원19 = 랜덤숫자
            System.out.printf("사원[%d] = %d\n",i+1 ,randnum[i]);
        }
    }
}

public class Ex07 {
    public static void main(String[] args) {
        RandomNumber rn = new RandomNumber();
        rn.setRandnum();
    }
}
