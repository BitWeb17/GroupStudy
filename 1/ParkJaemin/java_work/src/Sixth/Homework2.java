package Sixth;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int arr = rand.nextInt(7);

        int[] arr1 = new int[7];

        for (int i = 0; i < arr; i++) {
            arr1[i] = i + 1;
            System.out.printf(" arr[%d] = %d\n ", i, arr1[i]);
        }
    }
}
