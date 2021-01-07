package Seventh;

import java.util.Arrays;

class staffPerson2{
    int[] staffMember;
    int i, randNum, cnt;

    public void randomNumber(int num){
        int[] staffMember = new int[num];

        for(i = 1; i <= num; i++) {

            randNum = (int)(Math.random() * 21) + 1;
            System.out.println("A조 입니다.");
            if(staffMember[randNum] != 0)
                continue;

            cnt++;

            staffMember[randNum] = 1;
            System.out.printf("%d 번 = %d\n", i++, randNum);

            if(cnt == 20) {
                break;
            }
        }
        }
    //}

    @Override
    public String toString() {
        return "staffPerson{" +
                "staffMember=" + Arrays.toString(staffMember) +
                '}';
    }

}





public class HoemWork8 {
    public static void main(String[] args) {
        // 7번 문제를 중복이 허용되지 않도록 만든다.
        staffPerson sta = new staffPerson();
        sta.randomNumber(20);
        System.out.println(sta);
    }
}
