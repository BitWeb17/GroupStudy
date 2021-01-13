package Eleventh;

public class Matrix {
    private int row, col;
    private int[][] mat;

    // row행 col열 행렬을 만드는 생성자
    public Matrix (int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int[row][col];
    }

    // 입력받은 행렬 arr을 row행으로 만드는 생성자
    public Matrix (int[][] arr, int row) { // 인자가 하나인 이유: 행을 정하면 열은 자동으로 정해지기 때문

        // 바꾸는 것이 가능한지 boolean 값을 반환하는 메서드 checkAvailable 을 만들어 확인한다.
        // 가능하다면 true 를 불가능하다면 false 를 반환해 조건문을 수행할지 말지 판정한다.
        if (checkAvailable(arr, row)) {
            // row 행으로 만들 수 있다는 조건이기 때문에 인자로 받는 row 를 사용해도 되고
            // 값을 할당했기 때문에 this.row를 사용해도 된다.
            mat = new int[row][col];
            // 4 by 3      ===>     3 by 4
            // 1 2 3 4              1 2 3
            // 2 4 6 8              4 2 4
            // 3 6 9 12             6 8 3
            //                      6 9 12

            // 행렬의 형태를 바꾸는 알고리즘:
            // 행렬을 배열로 분해한 후 다시 행렬의 구조를 짠다.

            // 배열의 길이 == 행렬의 요소의 합
            int totalLen = row * col;
            // 분해한 행렬을 담을 배열
            int[] tmp = new int[totalLen];

            int arrRow = arr.length;    // 행
            int arrCol = arr[0].length; // 열

            // 행렬을 분해하는 반복문
            // * 2중 반복문에서 0 ~ 배열의 길이 만큼을 표현하는 방법: i * arrCol + j
            // 입력받은 행렬을 반복해 분해하기 때문에 범위는 입력받은 행렬기준 arrRow, arrCol
            for (int i = 0; i < arrRow; i++) {
                for (int j = 0; j < arrCol; j++) {
                    tmp[i * arrCol + j] = arr[i][j];
                }
            }

            // 배열을 행렬로 만드는 반복문
            // 새로 행렬의 구조를 만들기 때문에 범위는 입력받은 row,와 col
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = tmp[i * col + j];
                }
            }
        }
    }

    // 배열을 row 행 행렬로 만드는 생성자
    public Matrix(int[] arr, int row) {
        // 행렬이 아닌 배열을 입력받기 때문에 새로운 checkAvailable 을 만들어야한다.
        if (checkAvailable(arr, row)) {

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = arr[i * col + j];
                }
            }
        }
    }

    // 배열을 row 행 col 열로 만드는 생성자
    public Matrix(int[] arr, int row, int col) {
        if(checkAvailable(arr, row, col)) {
            // 실제로 이 생성자 내의 모든 코드는
            // 단일 배열에서 넘어온 값들을 행렬로 변환한다는 취지를 가짐
            // 그러므로 동일하게 중복되는 코드들이 발생할 것이고
            // 별도의 메서드로 분리하여 관리할 수 있음
            mat = new int[row][col];

            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    mat[i][j] = arr[i * col + j];
                }
            }
        }
    }

    private boolean checkDivideElement(int len, int row) {

        // 행렬의 크기는 행 X 열 이다.
        // 배열을 행렬로 바꾸는 경우:
        // 배열의 크기와 행렬의 크기가 같아야한다.
        // 그렇기 때문에 배열의 크기를 행 혹은 열로 나누었을 때
        // 나누어 떨어져야만 행렬로 변환이 가능하다.

        // 행렬을 다른 차원의 행렬로 바꾸는 경우:
        // 위와 마찬가지로
        // 행렬의 크기를 행 혹은 열로 나누었을 때
        // 나누어 떨어져야만 행렬로 변환이 가능하다.
        if (len % row == 0) {
            this.row = row;
            this.col = len / row;
        } else {
            System.out.printf("행렬로 변환할 수 없습니다.\n");
            System.out.printf("올바른 차원을 입력하세요.\n");
            System.out.printf("혹은 적절한 숫자(행)를 입력하세요\n");

            return false;
        }

        return true;
    }

    private boolean checkAvailable(int[][] arr, int insertRow) {

        int row = arr.length;    // 입력 받은 행렬의 행
        int col = arr[0].length; // 입력 받은 행렬의
        int len = row * col;     // 행  X 열 = 배열의 길이 or 행렬의 크기

        return checkDivideElement(len, insertRow);
    }

    private boolean checkAvailable(int[] arr, int row) {
        int len = arr.length;

        return checkDivideElement(len, row);
    }

    private boolean checkAvailable(int[] arr, int row, int col) {
        int len = arr.length;

        // 배열의 길이(행렬의 크기)가 행 X 열 의 값과 같으면 true 를 같지 않다면 false 를 res 에 대입한다.
        boolean res = (len == row * col ? true : false);

        // res 가 참이면 아래 동작을 수행
        if (res) {
            this.row = row;
            this.col = col;
        }

        // res 에 담긴 boolean 값을 반환한다.
        return res;
    }

    private boolean checkDimension(Matrix A, Matrix B) {
        int Arow = A.getRow();
//         Arow != Brow 를 사용한다면 필요 없어지는 변수 선언.
        int Acol = A.getCol();

        int Brow = B.getRow();
        int Bcol = B.getCol();

        return (Arow == Brow) && (Acol == Bcol);
    }

    private boolean checkMulDimension(Matrix A, Matrix B) {
        int Acol = A.getCol();
        int Brow = B.getRow();

        return Acol == Brow;
    }

    public void addMatrix(Matrix A, Matrix B) {
        if (checkDimension(A, B)) {
            int[][] matA = A.getMat();
            int[][] matB = B.getMat();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = matA[i][j] + matB[i][j];
                }
            }
        }
    }

    public void subMatrix(Matrix A, Matrix B) {
        if (checkDimension(A, B)) {
            int[][] matA = A.getMat();
            int[][] matB = B.getMat();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = matA[i][j] - matB[i][j];
                }
            }
        }
    }

    public void multiplyMatrix(Matrix A, Matrix B) {
        if (checkMulDimension(A, B)) {

            int[][] matA = A.getMat();
            int[][] matB = B.getMat();

            int Arow = matA.length;
//            int Acol = matA[0].length;

            int Brow = matB.length;
            int Bcol = matB[0].length;

            mat = new int[Arow][Bcol];
            int key = 0;
            int a;

            for (int i = 0; i < Arow; i++) {

                for (a = 0; a < Bcol; a++) {

                    for (int j = 0; j < Brow; j++) {
                        key += (matA[i][j] * matB[j][a]);
                    }
                    mat[i][a] = key;
                    key = 0;
                }
            }
        }
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int[][] getMat() {
        return mat;
    }

    public void printMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.println("");
        }
    }

    public void allocRandomMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                mat[i][j] = (int)(Math.random() * 10);
            }
        }
    }
}
