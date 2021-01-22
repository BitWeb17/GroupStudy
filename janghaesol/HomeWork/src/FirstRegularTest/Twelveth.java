package FirstRegularTest;
class untilfifty {
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
}
public class Twelveth {
    public static void main(String[] args) {


        untilfifty ft = new untilfifty();

        ft.randomArr();
    }
}