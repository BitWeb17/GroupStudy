public class Ex03 {
    public static void main(String[] args) {
        //1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, 79, ...
        //위의 수열에서 20번째 숫자를 찾도록 프로그래밍 해보자!

        int[] array = new int[20];

        array[0] = 1;
        array[1] = 1;
        array[2] = 3;

        for(int i = 3; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 3];
            System.out.printf("arr[%d] = %d\n", i , array[i]);
        }
    /*
         - 규칙(20번째)

        첫번째 항 + 세번째 항 = 네번째
        두번째 항 + 네번째 항 = 다섯번째
        1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, 79, ...

        final int TARGET = 20;
        final int ALREADY = 3;

        int loop = 0;
        int first = 1, second = 1, third = 3, res = 0;

        while(loop < TARGET - ALREADY){
            res = first + third;
            first = second;
            second = third;
            third = res;

            loop++;
        }
        System.out.println("res = " + res);
    */
    }
}
