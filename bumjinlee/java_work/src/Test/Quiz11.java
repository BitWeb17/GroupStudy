package Test;

class Array {
    int[][] array1;
    int[][] array2;
    int[][] result;


    public void Array() {
        array1 = new int[][]{
                {10, 20},
                {30, 40}
        };
        array2 = new int[][]{
                {50, 60},
                {70, 80}
        };
        result = new int[2][2];
    }

    public void PrintSumArray() {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
                System.out.println(result[i][j]);
            }
        }
    }
}

public class Quiz11 {
    public static void main(String[] args) {
        Array ar = new Array();

        ar.Array();
        ar.PrintSumArray();
    }
}