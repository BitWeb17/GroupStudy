package Sixth;

public class assignment4 {
    public static void main(String[] args) {

        float randNum = (float) (Math.random() * 5);
        System.out.println("float 형 배열에 랜덤 값 3개 출력");

        float[] arr = new float[5];

        for (int i = 0; i < 5; i++){

            arr[i] = (float) Math.random();

            System.out.printf("arr[%d] = %f\n", i, arr[i]);
        }




        }

    }
