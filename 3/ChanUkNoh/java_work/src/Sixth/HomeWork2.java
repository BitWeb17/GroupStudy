package Sixth;

public class HomeWork2 {
    public static void main(String[] args) {
        // 2) 1번 문제에서 만든 배열에 아무런 값을 할당해보자!

        int[] sevenArr = new int[7];

        for (int i = 0; i < sevenArr.length; i++) {
            sevenArr[i] = i + 1;
            System.out.printf("sevenArr[%d] = %d\n", i, sevenArr[i]);
        }
    }
}
