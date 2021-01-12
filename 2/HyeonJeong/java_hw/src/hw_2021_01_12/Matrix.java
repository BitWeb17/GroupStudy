package hw_2021_01_12;

public class Matrix {
    final int ADD = 1;
    final int SUB = 2;
    final int MUL = 3;
    final int DIV = 4;

    private int row, col;
    private int[][] matrix;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;

        matrix = new int[row][col];
    }

    public Matrix(int[] arr, int row, int col) {
        this.row = row;
        this.col = col;

        matrix = new int[row][col];

        for(int r = 0; r < row; r++) {
            for(int c =0; c < col; c++) {
                matrix[r][c] = arr[r*col+c];
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

    public Matrix(int[] array, int col) {
        this.col = col;
        this.row = array.length/col;

        matrix = new int[row][col];

        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                matrix[r][c] = array[r*col+c];
            }
        }
    }

    public void calculate_matrix(
            int[][] array1, int[][] array2, final int ORDER) {
        matrix = new int[array1.length][array1[0].length];
        this.row = array1.length;
        this.col = array1[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                switch(ORDER) {
                    case ADD:
                        matrix[i][j] = array1[i][j] + array2[i][j];
                        break;
                    case SUB:
                        matrix[i][j] = array1[i][j] - array2[i][j];
                        break;
                    case MUL:
                        matrix[i][j] = array1[i][j] * array2[i][j];
                        break;
                    case DIV:

                        break;
                    default:
                        break;
                }
            }
        }
    }

    public int[][] allocate_random_matrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = (int)(Math.random() * 10) + 1;
            }
        }
        return matrix;
    }

    public void print_Matrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public void print_Matrix(int[][] matrix) {
        this.row = matrix.length;
        this.col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println("");
        }
    }
}