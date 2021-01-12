package Tenth_HomeWork;

class Matrix {
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


    public Matrix(int[][] arr, int start, int end){
        this.start = start;
        this.end = end;
        this.arr = arr;

    }
    public Matrix(int start, int end){
        this.start = start;
        this.end = end;
        mat = new int[start][end];

    }

    public void printmxtest() {
        for (int i = 0; i < start; i++) {

            for (int j = 0; j < end; j++) {
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println("");
        }
    }
    public void printmxtest2() {

        for (int i = 0; i < start; i++) {

            for (int j = 0; j <start ||j <end; j++) {
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println("");
        }
    }

   // public void plusmat();

    public void allocRandomDoubleArray(){
        {
            int cnt;
        for(cnt =0;cnt <2;cnt++){

            if (cnt == 0) {
                for (int i = 0; i < start; i++) {
                    for (int j = 0; j < end; j++) {
                        mat[i][j] = (int) (Math.random() * 10);
                        System.out.printf("%3d", mat[i][j]);


                    }
                    System.out.println("");
                }
            }

            if (cnt == 1) {
                for (int i = 0; i < start; i++) {
                    for (int j = 0; j < end; j++) {
                        mat[i][j] = (int) (Math.random() * 10);
                        System.out.printf("%3d", mat[i][j]);
                        //mat2[i][j] =mat[i][j];
                       // sum[i][j] = mat[i][j] +mat[i][j];
                       System.out.printf("%3d", sum[i][j]);
                    }
                    System.out.println("");
                }
            }


        }
        }


    }
    public void printArray(){
        //mat = new int[start][end];
        for (int i =0; i <start;i++){
            for(int j =0; j <end;j++){

                System.out.printf("%3d",mat[i][j]);
            }
            System.out.println("");
        }
    }



}

