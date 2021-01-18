package Sixth;

import java.util.Random;

public class HW2_0106 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
