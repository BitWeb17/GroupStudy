package Test;

class RandomArray {
    int rd;
    int[] arr = new int[rd];

    public RandomArray() {
        rd = (int) ((Math.random()*100)+1);

        System.out.printf("랜덤한 배열 번호: arr[%d]  ", rd);
    }
}

public class Quiz3 {
    public static void main(String args[]) {
        RandomArray qz3 = new RandomArray();

    }
}

