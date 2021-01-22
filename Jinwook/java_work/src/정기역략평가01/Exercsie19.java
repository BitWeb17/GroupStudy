package 정기역략평가01;
class RandomArrAndNum {
    private int[] randArr;
    private int randNum;

    public RandomArrAndNum() {
        randNum = (int) (Math.random() * 50) + 1;
        randArr = new int[randNum];
    }

    public void allocRandArrNum() {

        for (int i = 0; i < randArr.length; i++) {
            randNum = (int) (Math.random() * 50) + 1;
            randArr[i] = randNum;
            System.out.printf("arr[%2d] = %d\n", i, randArr[i]);


        }
    }

    public void print() {
        for (int i = 0; i < randArr.length; i++) {
            if (randArr[i] % 2 == 0) {
                System.out.print("짝"+randArr[i]);
            } else {
                System.out.print("홀"+randArr[i]);
            }
        }
    }
}


public class Exercsie19 {
    public static void main(String[] args) {
        RandomArrAndNum raan = new RandomArrAndNum();
        raan.allocRandArrNum();
        raan.print();

    }
}
