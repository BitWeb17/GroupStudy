package hw_2021_01_12;

public class HW03 {
    public static void main(String[] args) {
        // 덧셈이 있다면 뺄셈도 있으니 뺄셈을 만들어보자!
        Matrix sum_for_matrixA = new Matrix(3,5);
        Matrix sum_for_matrixB = new Matrix(3,5);

        int[][] matrix1 = sum_for_matrixA.allocate_random_matrix();
        int[][] matrix2 = sum_for_matrixB.allocate_random_matrix();

        Matrix sum_AnB = new Matrix(3,5);
        sum_AnB.calculate_matrix(matrix1, matrix2, sum_AnB.SUB);

        sum_AnB.print_Matrix(matrix1);
        System.out.println(" ---- MINUS ----");
        sum_AnB.print_Matrix(matrix2);
        System.out.println(" ----- SUM -----");

        sum_AnB.print_Matrix();
    }
}
