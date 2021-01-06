package Sixth;

public class assignment3 {
    public static void main(String[] args) {
        System.out.println("20번째 숫자를 찾는");

        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;

        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 3];
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
