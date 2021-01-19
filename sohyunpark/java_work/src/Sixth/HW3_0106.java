package Sixth;

import java.util.Scanner;

public class HW3_0106 {
    public static void main(String[] args) {
        // 1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, 79, ...
        // 위 수열에서 20번째 숫자를 찾도록 하자
        System.out.println("20번째 항을 구해보자!");

        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;

        for(int i = 3; i < arr.length; i++){
            arr[i] = arr[i - 3] + arr[i - 1];
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

    }
}
