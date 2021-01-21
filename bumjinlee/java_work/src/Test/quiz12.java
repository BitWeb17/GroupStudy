package Test;
// 1 ~ 50 까지의 숫자를 임의로 배열에 할당하고 출력하기.


public class quiz12 {
    public static void main(String[] args) {

        int araySize = 50;

        int[] arr = new int[araySize];

        for (int i = 0; i < araySize; i++) {
            arr[i] = (int) (Math.random() * 50)+1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
