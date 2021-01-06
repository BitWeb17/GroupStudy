package Sixth;

public class FirstArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = i + 1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
