package Tenth;

public class Test {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};



        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                // 이중 배열의 경우 안쪽에 있는 녀석이 큰 공간이다.
                /// 바깥쪽에 있는 배열은 큰 공간을 다시 나눈 작은 공간이다.
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println("");
        }



    }
}