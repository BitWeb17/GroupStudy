package hw_2021_01_12;

public class HW02 {
    public static void main(String[] args) {
        //   행렬 두 개를 만들고 이 두 개의 행렬 덧셈을 수행하게 만들어보자!
        //   행렬의 차원은 편한대로 설정해도 무방하다.
        //   (오늘 만든 코드는 n by n 행렬도 가능하다)
        Matrix sum_for_matrixA = new Matrix(3,5);
        Matrix sum_for_matrixB = new Matrix(3,5);

        int[][] matrix1 = sum_for_matrixA.allocate_random_matrix();
        int[][] matrix2 = sum_for_matrixB.allocate_random_matrix();

        Matrix sum_AnB = new Matrix(3,5);
        sum_AnB.calculate_matrix(matrix1, matrix2, sum_AnB.ADD);

        sum_AnB.print_Matrix(matrix1);
        System.out.println(" ----- PLUS -----");
        sum_AnB.print_Matrix(matrix2);
        System.out.println(" ----- SUM -----");

        sum_AnB.print_Matrix();
    }
}
