package Test;

// 문제 3. 클래스를 사용하여 임의의 난수 배열을 생성하도록 프로그래밍
class RandomArray {
    private int randNum;
    private int[] arr;

    public RandomArray() {
        randNum = (int) (Math.random() * 10) + 1;
        arr = new int[randNum];
    }

    public void PrintRandomArray() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;

            System.out.printf("arr[%d] %d \n", i, arr[i]);
        }
    }
}

public class Quiz3 {
    public static void main(String args[]) {
        RandomArray ra = new RandomArray();
        ra.PrintRandomArray();
    }
}

