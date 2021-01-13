package Tenth;

public class Matrix {
    final int array2Matrix = 0;
    final int calcMatrix = 1;
    final int add = 2;
    final int subtract = 3;
    final int multiple = 4;

    private int[][] mat;
    private int i, j;
    private int column, row;
    private int[] userArr;

    public Matrix(int row, int column) {
        this.row    = row;
        this.column = column;

        mat = new int[row][column];
    }

    public Matrix(int[] userArr, int row, int column) {
        this.row    = row;
        this.column = column;

        this.userArr = userArr;
        mat = new int[row][column];
    }

    public Matrix(int[] userArr, int square) {
        this.row     = square;
        this.column  = square;

        this.userArr = userArr;
        mat = new int[row][column];
    }

    public void array2Matrix() {

        if (row * column != userArr.length) {
            printError(array2Matrix);
            return;
        }

        int userArrIndex = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                mat[i][j] = userArr[userArrIndex];
                userArrIndex++;
            }
        }
    }

    public void calcMatrix(int[][] matLeft, int[][] matRight, int calcOrder) {

        switch (calcOrder) {

            case add:
                if (matLeft.length != matRight.length) {
                    printError(calcMatrix);
                    return;
                }
                for (i = 0; i < row; i++) {
                    for (j = 0; j < column; j++) {
                        mat[i][j] = matLeft[i][j] + matRight[i][j];
                    }
                }
                break;

            case subtract:
                if (matLeft.length != matRight.length) {
                    printError(calcMatrix);
                    return;
                }
                for (i = 0; i < row; i++) {
                    for (j = 0; j < column; j++) {
                        mat[i][j] = matLeft[i][j] - matRight[i][j];
                    }
                }
                break;

            case multiple:
                int leftRow = matLeft.length; // 행 가로
                int leftColumn = matLeft[0].length;

                int rightRow = matRight.length;
                int rightColumn = matRight[0].length;// 열 세로

                mat = new int[leftRow][rightColumn];
                int key = 0;
                int a;

                for (i = 0; i < leftRow; i++) {

                    for (a = 0; a < rightColumn; a++) {

                        for (j = 0; j < leftRow; j++) {
                            key += matLeft[i][j] * matRight[j][a];
                        }
                        mat[i][a] = key;
                        key = 0;
                    }
                }
                break;
            default:
                break;
        }
    }

    public void printMatrix() {

        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.printf("%5d", mat[i][j]);
            }
            System.out.println("");
        }
    }

    private void printError(int errorCode) {

        switch (errorCode) {
            case array2Matrix:
                System.out.printf("Error Occurred\n" +
                        "Required array length: %d\n" +
                        "Provided array length: %d\n", row * column, userArr.length);
                break;

            case calcMatrix:
                System.out.println("Require: same matrix size");
                break;

            default:
                break;
        }

    }

    public int[][] getAllocRandomMatrix() {
        allocRandomMatrix();

        return mat;
    }

    public void allocRandomMatrix() {
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                mat[i][j] = (int)(Math.random() * 10);
            }
        }
    }
}
