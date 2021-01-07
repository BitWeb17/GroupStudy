// 총 20명의 사원이 있다고 가정한다.
// 20명 모두에게 랜덤한 번호가 할당되도록 만든다(중복 불가)
// 8번 문제에서 번호별로 상금과 꽝이 존재하도록 하여
// 당첨되면 '상금을 xxx 받았습니다.'
// 꽝이면 '아쉽네요 ~ 다음에 재도전을!' 이 출력되도록 만든다
import java.util.Arrays;

class Sawon2 {
    int randNum;
    int cnt;
    int [] person;

    public void setRandNum() {
        this.randNum = 0;
    }

    public void setCnt() {
        this.cnt = 0;
    }

    public void random([] num){
        person = new int[num];

        for(int i = 0; i < 20; i++) {
            num[i] = 0;
        }

        for(i = 1; ;) {
            randNum = (int)(Math.random() * 20) + 1;

            if(num[randNum - 1] != 0)
                continue;

            cnt++;

            num[randNum - 1] = 1;
            System.out.printf("%d 번 = %d\n", i++, randNum);

            if(cnt == 20) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(person);
    }
}


public class Quiz8To9 {
    public static void main(String[] args) {
        
        Sawon2 sawon2 = new Sawon2();
        sawon2.random();
        System.out.println(sawon2);
    }
}
