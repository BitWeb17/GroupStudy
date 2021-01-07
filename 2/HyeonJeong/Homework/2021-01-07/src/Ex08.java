class SuffleNumber {
    final int MEMBER = 20;
    int[] check;
    int[] workers;
    int count;
    int randnum;

    public void setCheck() {
        count = 0;
        check = new int[MEMBER];            //빈 배열 생성
        workers = new int[MEMBER];          //빈 배열 생성

        for(int i = 0; i < MEMBER; i++) {
            check[i] = 0;                   //배열전체에 0을 넣는다
            workers[i] = 0;                 //배열전체에 0을 넣는다
        }

        for(;;) {                           //무한루프
            randnum = (int)(Math.random() * MEMBER) + 1;
                                            //랜덤숫자 생성 1 ~ 20까지
            if(check[randnum - 1] == 0) {   //0으로 초기화 한 배열의 randnum-1번째가 0이면
                check[randnum - 1] = 1;     //0을 1로 바꾸고
                workers[count] = randnum;   //바뀐횟수번째 배열에 랜덤숫자 넣기
                System.out.printf("workers[%d] = %d\n", count+1, workers[count]);
                count++;                    //0 => 1로 바뀐 횟수증가
            } else {
                continue;                   //randnum-1의 숫자가 0이 아닐경우는 다시 숫자를 뽑는다.
            }
            if(count >= MEMBER){            //0 => 1로 바뀐 횟수가 MEMBER와 같거나 크면
                break;                      //무한루프 탈출!
            }
        }
    }
}

public class Ex08 {
    public static void main(String[] args) {
        SuffleNumber sn = new SuffleNumber();
        sn.setCheck();
    }
}
