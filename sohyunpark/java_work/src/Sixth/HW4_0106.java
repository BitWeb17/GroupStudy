package Sixth;

import java.util.Random;

public class HW4_0106 {
    public static void main(String[] args) {
        // float형 배열에 랜덤 값 3개 입력하기

        Random rand = new Random();

        float[] arr = new float[3];

        for(int i = 0; i < arr.length; i++){
           arr[i] = rand.nextFloat();
            System.out.printf("arr[%d] = %f\n", i, arr[i]);
        }

    }
}
