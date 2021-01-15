package Tenth;

public class Homework2 {
    public static void main(String[] args) {
        Matrix mat = new Matrix(3, 3);

        int[][] a = {
                {1, 2},
                {3, 4},
                {4, 5}
        };
        int[][] b = {
                {5, 6, 7},
                {8, 9, 10}
        };

        mat.calcMatrix(a, b, mat.multiple);
        mat.printMatrix();
    }
}
//