package jacajungsuk;

import java.util.Arrays;

public class arry_print_EX {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        //int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random() * 10) + 1;
        }

        for(int i = 0; i < iArr1.length; i++) {
            System.out.printf("iArr1[%d] = %d, ", i, iArr1[i]);
        }
        System.out.println();

        System.out.println("Arrays.toString(iArr1) = " + Arrays.toString(iArr1));
        System.out.println("Arrays.toString(iArr2) = " + Arrays.toString(iArr2));
        System.out.println("Arrays.toString(chArr) = " + Arrays.toString(chArr));
        System.out.println("iArr3 = " + iArr3);
        // 차이점이 생긴다.
        System.out.println("chArr = " + chArr);
        System.out.println(chArr);
        System.out.print(chArr);
    }
}
