package Ninth_2021_01_11;

public class AllocRandom {
    final int RANGE_ARR = 6;
    final int BIAS_ARR = 5;

    final int RANGE_VALUE = 101;
    final int BIAS_VALUE = 10;

    int numOfRandom;
    int[] randArr;
    int[] indexArr;
    int randPick;

    //재활용을 용이하게 만드려면
    // 딱 필요한 기능만 구현하고 빠진다
    // 부가적으로 더 덕지덕지 붙일려고 하는 순간 오염도가 높아진다.
    // 결국 나중에 재활용을 못하게 되고
    // 재활용을 못하게 되면 유지보수가 힘들어진다.
    // 유지보수가 힘들어지면 야근을 반드시 할 수 밖에 없어진다.

    // 생정자: 초기화'

    public AllocRandom() {
        numOfRandom = (int)(Math.random() * RANGE_ARR) + BIAS_ARR;

        randArr = new int[numOfRandom];
        indexArr = new int[numOfRandom];
    }

    // Random Number(랜덤번호) -> Array(배열) to
    public void alloc_RandomNumber_2_Array() {
        for(int i =0; i < randArr.length; i++) {
            randArr[i] = (int)(Math.random() * RANGE_VALUE) + BIAS_VALUE;
        }
    }

    public void delete_RandomNumber_Value() {
        randPick = (int)(Math.random() * numOfRandom);

//        System.out.printf("randPick = %d\n", randPick);
        randArr[randPick] = -1;
    }

    public void print_RandomArr() {
        int count = 1;

        for(int i = 0; i < randArr.length; i++) {
            if(randArr[i])
        }
    }
}
