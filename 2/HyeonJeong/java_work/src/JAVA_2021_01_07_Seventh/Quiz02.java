package JAVA_2021_01_07_Seventh;

import java.util.Arrays;

class SalaryCalculator {
    int[] WorkersAccount; //빈 배열 생

    public void setRandomPayment(int workers) {
        WorkersAccount = new int[workers]; // 회사원의 수만큼 배열을 생성

        for(int i = 0; i < workers; i++) {
            WorkersAccount[i] = (int)(Math.random() * 1201) +2400;
            // 회사원[0] = 랜덤급여, 회사원[1] = 랜덤급여
        }
    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "WorkersAccount=" + Arrays.toString(WorkersAccount) +
                '}';
    }
}

public class Quiz02 {
    public static void main(String[] args) {
        SalaryCalculator sc = new SalaryCalculator(); //클래스를 사용할때는 new선
        sc.setRandomPayment(4);

        System.out.println(sc);
    }
}
