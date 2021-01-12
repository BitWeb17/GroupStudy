package Tenth_HomeWork;

public class TESTMAT {
    // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // Matrix A = new Matrix(arr, 3 ,3);
    // 혹은
    // Matrix A = new Matrix(arr,3);
    // 둘다 동작이 되어야 할 것이다.
    int start;
    int end;
    int[][] arr;
    int[][] mat;
    int[][] mat2;
    int[][] sum;


    public TESTMAT(int[][] arr, int start, int end){
        this.start = start;
        this.end = end;
        this.arr = arr;

    }
    public TESTMAT(int start, int end){
        this.start = start;
        this.end = end;
        mat = new int[start][end];
        mat2 =new int[start][end];

    }

    public void printmxtest() {
        for (int i = 0; i < start; i++) {

            for (int j = 0; j < end; j++) {
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println("");
        }
    }

    public void Mat1(){
        for (int i = 0; i < start; i++){
            for (int j =0 ; j<end; j++){
                mat[i][j] = (int) (Math.random()*10);
            }
        }
    }


    public void Mat2(){
        for (int i = 0; i < start; i++){
            for (int j =0 ; j<end; j++){
                mat[i][j] = (int) (Math.random()*10);
            }
        }
    }





}