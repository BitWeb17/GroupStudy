package Sixth;

public class HW6_0106 {
    public static void main(String[] args) {
        // 1 ~ 100까지의 숫자 중 3의 배수를 배열에 저장하고 출력
        int[] arr = new int[100];
        int Num = 1;

        while(Num <= 100){
            if(Num % 3 == 0){
                arr[Num] = Num;
                System.out.printf("arr[%d] = %d\n", (Num/3)-1, arr[Num]);
            }

            Num++;
        }
    }
}
