package Test;

// 1 ~ 50 까지의 숫자를 임의로 배열에 할당하고 출력하기.
class RandomArray2 {
    private final int RANDOMNUM = 50;
    private int[] arr;

    public RandomArray2() {
        arr = new int[RANDOMNUM];
    }

    public void PrintArray() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*50)+1;
            System.out.printf("arr[%d] %d \n", i, arr[i]);
        }
    }
}

public class Quiz12 {
    public static void main(String[] args) {
        RandomArray2 ra = new RandomArray2();
        ra.PrintArray();
    }
}
