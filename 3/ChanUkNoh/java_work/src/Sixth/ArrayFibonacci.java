package Sixth;

import java.util.Scanner;

public class ArrayFibonacci {
    public static void main(String[] args) {

        int[] arr = new int[13];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.printf("arr[%d] = %d",i, arr[i]);
        }
    }
}
