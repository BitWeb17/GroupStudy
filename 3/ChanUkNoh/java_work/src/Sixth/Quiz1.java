package Sixth;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        // 위의 코드를 n 번째 항을 찾는 혀애로 변경해보자!

        Scanner scan = new Scanner(System.in);

        System.out.println("피보나치 수열 몇 번째 항을 구할까요?");
        int num = scan.nextInt();

        int[] arr = new int[num];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
        System.out.printf("%d번째 항은 %d 입니다.", num, arr[num - 1]);
    }
}
