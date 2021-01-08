class Lotto {
    final int MEMBER = 20;
    int[] check;
    int[] workers;
    int count;
    int randnum;

    public void setRandnum() {
        count = 0;
        check = new int[MEMBER];            //빈 배열 생성
        workers = new int[MEMBER];          //빈 배열 생성

        for (int i = 0; i < MEMBER; i++) {
            check[i] = 0;                   //배열전체에 0을 넣는다
            workers[i] = 0;                 //배열전체에 0을 넣는다
        }

        for (; ; ) {                           //무한루프
            randnum = (int) (Math.random() * MEMBER) + 1;
            //랜덤숫자 생성 1 ~ 20까지
            if (check[randnum - 1] == 0) {   //0으로 초기화 한 배열의 randnum-1번째가 0이면
                check[randnum - 1] = 1;     //0을 1로 바꾸고
                workers[count] = randnum;   //바뀐횟수번째 배열에 랜덤숫자 넣기
                count++;                    //0 => 1로 바뀐 횟수증가
            } else {
                continue;                   //randnum-1의 숫자가 0이 아닐경우는 다시 숫자를 뽑는다.
            }
            if (count >= MEMBER) {            //0 => 1로 바뀐 횟수가 MEMBER와 같거나 크면
                break;                      //무한루프 탈출!
            }
        }
    }

    public void Lotto_log() {
        randnum = (int)(Math.random() * MEMBER);
        System.out.println("행운의 숫자: "+ randnum);
        for(int j = 0; j < MEMBER; j++) {
            if (workers[j] == randnum) {
                System.out.println("상금을 xxx 받았습니다.");
            } else {
                System.out.println("아쉽네요~ 다음에 재도전을!");
            }
        }
    }

}

public class Ex09 {
    public static void main(String[] args) {
        Lotto l = new Lotto();
        l.setRandnum();
        l.Lotto_log();
    }
}
