package JAVA_2021_01_12_Tenth;

public class Matrix {
    private int row, col;
    private int[][] mat;


    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int[row][col];
    }

    public Matrix(int[] arr, int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int[row][col];

        for(int r = 0; r < row; r++) {
            for(int c =0; c < col; c++) {
                mat[r][c] = arr[r*col+c];
            //        c: 0 1 2 0 1 2 0 1 2
            //        r: 0 0 0 1 1 1 2 2 2
            //     arr : 0 1 2 3 4 5 6 7 8
            //-----------------------------
            // r*col+c : 0 1 2 3 4 5 6 7 8
            // 0*3+0 = 0, 0*3+1 = 1, 0*3+2 = 2...
            // 2*3+0 = 6, 2*3+1 = 7, 0*3+2 = 8
            }
        }
    }

    public Matrix(int[] arr, int col) {
        this.col = col;
        this.row = arr.length/col;

        mat = new int[row][col];

        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                mat[r][c] = arr[r*col+c];
            }
        }
    }
    public void allocRandomMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                mat[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    public void printMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%3d",mat[i][j]);
            }
            System.out.println("");
        }
    }
}
