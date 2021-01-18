package Sixth;

public class Homework5 {
    public static void main(String[] args) {
////        //1 ~ 100 까지 숫자중 3 의 배수만 출력해보자!
//        int num = 3;
//
//        while (num < 100) {
//            if (num % 3 == 0) {
//                System.out.println("num = " + num++);
//            }
//            num++;
//        }
//
//        5번 문제에서 출력한 값들을 출력하지 않고
//           배열에 저장하고 출력하도록 한다.

        int[] arr = new int[99];

        arr[0] = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
              if(arr[i] % 3 == 0 )
                    System.out.printf("arr[%d] = %d\n", i, arr[i]);

            }
        }
    }


