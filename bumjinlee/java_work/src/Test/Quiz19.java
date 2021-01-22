package Test;

// 임의의 난수들을 임의의 배열 크기에 저장하고 이 값들을 출력해보자
// 또한 짝수만 따로 홀수만 따로 출력할 수 있게 메서드를 작성
class ArrayNumOutPut {
    private final int randNum;
    private int[] numArr;


    public ArrayNumOutPut() {
        randNum = (int) (Math.random() * 10) + 1;
        numArr = new int[randNum];
    }

    public void PrintArray() {
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10) + 1;

            System.out.println("랜덤 출력 : " + numArr[i]);
        }
    }

    public void PrintOddArray(int oddNum) {
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10) + 1;
            if (numArr[i] % oddNum == 0) {

                System.out.println("짝수 = " + numArr[i]);
            }
        }
    }

    public void PrintEvenArray(int evenNum) {
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % evenNum != 0) {

                System.out.println("홀수 = " + numArr[i]);
            }
        }
    }
}

public class Quiz19 {
    public static void main(String[] args) {
        ArrayNumOutPut ao = new ArrayNumOutPut();
        ao.PrintArray();
        System.out.println("");
        ao.PrintOddArray(2);
        System.out.println("");
        ao.PrintEvenArray(2);
    }
}