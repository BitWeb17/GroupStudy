public class Quiz6 {
    public static void main(String[] args) {
        // 피보나치 수열을 프로그래밍으로 구현해보자!
        // 구체적으로 13번째 항의 숫자를 구하도록 만들어보자!
        //
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, .......
        //
        // 힌트
        //
        // 1) 숫자가 올라가는 규칙을 찾아야 한다.
        // 2) 구현을 한다 했을 경우 while() 을 사용해야함
        // 3) 첫번째 더할값, 두번째 더할값, 계산한 값의 변수가 3개 필요함

        // 1, 1, 3, 3, 5, 8, 13, 21, 34, 55, 89, .......

        //-----------------------------------------------
        //  첫번째 항 + 세 번째 항 = 네번째
        // 두번쨰 항 + 네  번쨰 항 = 다섯뻔재
        // 1  1 3 4 5 8 12 17 25 37 54 79
        final int TARGET = 20;
        final int ALREADY = 3;

        int loop = 0;
        int first = 1, second = 1, third = 3, res = 0;

        // first   second   res
        //   1       1       3
        //   4       5       8
        //   12      17      25
        //   37      54      79

        while(loop < TARGET - ALREADY) {
            res = first+third;
            first = second;
            second = third;
            third=res;

            loop++;
        }

        System.out.println("res = " + res);
    }
}


