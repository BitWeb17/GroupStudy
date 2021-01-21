package FirstRegularTest;
class doubArr{
    int[][] arr1;
    int[][] arr2;
    int maxSize;
    int eachNum;
    int sumNum;


    public void firstArr(){
        eachNum = (int)(Math.random()*10);
        maxSize = 2;
        for(int i =0; i < maxSize; i ++){
            for(int j = 0; j < maxSize; j ++){
                System.out.printf("%2d",arr1[i][j]);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = eachNum;
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }

}

public class Eleventh {
    public static void main(String[] args) {
        doubArr dA = new doubArr();
        int arr[][] = {
                {1, 0},
                {1, 0}
        };


        dA.firstArr();

    }
}
