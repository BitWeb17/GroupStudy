package Sixth;

import java.util.Scanner;

public class InputArrayFibonacci {
    public static void main(String[] args) {
        final int  FIXVALUE = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("몇 번째 피보나치 항을 구할까요 ? ");
        int num = scan.nextInt();

        if(num <= 0){
            System.out.println("잘못된 입력입니다!");
            return;
        } else if(num < 3) {
            System.out.printf("%d 번째 피보나치 항은 = %d\n", num, FIXVALUE);
            // return 이후 현재 프로그램은 더 이상 동작하지 않는다.
            // 실제로는 메서드를 종료한 것인데
            // 현재는 아직 클래스 학습하지 않았으므로
            // main 을 종료한다고만 알아두자!
            return;
        }

        int[] arr = new int[num];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.printf("%d 번째 피보나치 항은 = %d\n", num, arr[num - 1]);
    }
}
