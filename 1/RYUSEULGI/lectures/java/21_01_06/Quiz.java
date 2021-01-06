public class Quiz {
    public static void main(String[] args){

    
        // 문제 1번

        int[] array = new int[7];

        for(int i =0; i< array.length; i++){
            array[i] = i + 1;
            System.out.println(array[i]);
        }

        // 문제 2번

        int[] arr = new int[7];

        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random() * 7);
            System.out.println(arr[i]);
        }

        // 문제 3번 

        int[]pivonachi = new int[20];

        pivonachi[0] =1;
        pivonachi[1] =1;

        for(int i =2; i< pivonachi.length; i++){
            pivonachi[i] = pivonachi[i - 1] + pivonachi[i - 2];
        }
        System.out.println(pivonachi[19]);

        // 문제 4번

        float[] Arr = new float[3];

        for(int i=0; i<Arr.length; i++){
            Arr[i] = (int)(Math.random() * 7);
            System.out.println(Arr[i]);
        }

        // 문제 5번

        int[] hundred = new int[100];

        for(int i =0; i < hundred.length; i++){

            hundred[i] = i + 1;

            if( hundred[i] % 3 == 0){
                System.out.println(hundred[i]);
            }
        }

        // 문제 6번 

        int[] save = new int[100];

        for(int i =0; i < save.length; i++){

            save[i] = i;

            if( save[i] % 3 == 0){
                System.out.println(save[i]);
            }


        // 문제 7번 

        // int k, randNum, cnt = 0;
        // int[] checkDup = new int[17];

        // for(k = 0; k < 17; k++) {
        //     checkDup[k] = 0;
        // }

        // System.out.println("A조 입니다.");
        // // 5, 4
        // for(k = 1; ;) {
        //     randNum = (int)(Math.random() * 9) + 1;

        //     if(checkDup[randNum - 1] != 0)
        //         continue;

        //     cnt++;

        //     checkDup[randNum - 1] = 1;
        //     System.out.printf("%d 번 = %d\n", k++, randNum);

        //     if(cnt == 9) {
        //         break;
        //     }
        // }1; ;) {
        //     randNum = (int)(Math.random() * 9) + 1;

        //     if(checkDup[randNum - 1] != 0)
        //         continue;

        //     cnt++;

        //     checkDup[randNum - 1] = 1;
        //     System.out.printf("%d 번 = %d\n", k++, randNum);

        //     if(cnt == 9) {
        //         break;
        //     }
        // }

        // 변수 i, randNum, cnt 선언
        // checkDup 배열의 수는 17
        // checkDup 배열을 반복으로 돌린다.
        // A조 입니다. 출력
        // 1~9를 무한루프로 돌리는데 
        // checkDup 배열의 수가 0이 아니라면 계속 반복
        // count는 1씩 증가,
        // ??
        // 배열의 수가 9가 된다면 반복문을 멈춰라

        }
    }

}
