package hw_2021_01_12;

public class HW01 {
    public static void main(String[] args) {
        //   오늘 만든 Matrix 클래스를 개조하여
        //   사용자의 배열을 입력받아 행렬을 만들도록 개조해보자!
        //   실제 matlab의 풀 라이센스 가격은
        //   수십억 ~ 백억 이상 되는 소프트웨어다.
        //ex) numpy나 matlab이라는 파이썬 라이브러리
        //    혹은 소프트웨어에 존재하는 기능으로
        //    아래와 같은 것이 되게 만드는 것이다.
        //
        //    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //    Matrix A = new Matrix(arr, 3, 3);
        //    혹은
        //    Matrix A = new Matrix(arr, 3);
        //    둘 다 동작이 되어야 할 것이다.
        int[] one_to_ten = {1,2,3,4,5,6,7,8,9};

        System.out.println("배열을 받아 행렬 만들기!");
        Matrix matrix = new Matrix(one_to_ten,3 ,3);
        matrix.print_Matrix();

        System.out.println("\nrow값 인자 입력 없이 배열을 받아 행렬 만들기!");

        Matrix matrix_without_row = new Matrix(one_to_ten,3);
        matrix_without_row.print_Matrix();
    }
}
