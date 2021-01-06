package Sixth;

import java.util.Random;

public class assignment2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int randNum = rand.nextInt(7)+1;

        int[] num = new int[7];

        for (int i = 0; i < 7; i++) {
            num[i] = i + randNum;

            System.out.printf("num[%d] = %d\n", i, num[1]);
        }

    }
}

