package FirstRegularTest;

class FifthRandom {
    int[][] arr;
    int maxSize;


    public void randomArr() {
        maxSize = 2;
        arr = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 50) + 1;
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println("");
        }
    }
    public void printArr(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == 0){
                    System.out.printf("arr[0][" + j + "] : %3d\n", arr[0][j]);
                }else if(i == 1){
                    System.out.printf("arr[1][" + j + "] : %3d\n", arr[1][j]);
                }
            }
        }
    }
}
public class Thirteenth {
    public static void main(String[] args) {


        FifthRandom ft = new FifthRandom();

        ft.randomArr();
        ft.printArr();
    }
}