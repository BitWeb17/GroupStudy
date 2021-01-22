package Test;

import java.util.Arrays;
// 12번 문제를 할당한 배열을 다시 정렬하여 출력해보도록 프로그래밍

class ArrayOutPut {
    private final int ARRAYSIZE = 50;
    private int[] arr;

    public ArrayOutPut() {
        arr = new int[ARRAYSIZE];
    }

    public void PrintSortArray() {
        for (int i = 1; i < ARRAYSIZE; i++) {
            arr[i] = (int) (Math.random() * 49) + 1;

            for (int j = 1; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        Arrays.sort(arr);
        for (int i = 0; i < ARRAYSIZE; i++) {
            System.out.printf("arr[%d] = %d\n", arr[i] + 1, i + 1);
        }
    }
}

public class Quiz13 {
    public static void main(String[] args) {
        ArrayOutPut ao = new ArrayOutPut();
        ao.PrintSortArray();
    }
}
