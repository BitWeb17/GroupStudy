package FirstRegularTest;

import java.util.ArrayList;

class location {
    /*
    private static Object myall;
    private static Object gasall;
    int x;
    int y;
    int myx;
    int myy;
    int[] gasstationx;
    int[] gasstationy;
    int farx;
    int fary;
    int sum;
    float farFromHere;
    int[] arr;

    public static Object myLo(int myx, int myy) {
        myx = (int) (Math.random() * 100);
        myy = (int) (Math.random() * 100);
        System.out.printf("나의 현재좌표 : (%2d,%2d)\n", myx, myy);
        return myall;
    }

    public static Object gasLo(int[] gasstationx, int[] gasstationy) {
        int cntMax = 4;
        for (int i = 0; i < cntMax; i++) {
            gasstationx[i] = (int) (Math.random() * 100);
            gasstationy[i] = (int) (Math.random() * 100);
            System.out.printf("[%d]번째 주유소의 위치는 : (%2d, %2d)\n", i + 1, gasstationx[i], gasstationy[i]);

        }
        return gasall;
    }

    public howfar(Object[] arr1,Object[] arr2) {

        int[] arr1 = new int[0];

        farx = myx - x;
        fary = myy - y;
        if ((farx) < 0) {
            farx = farx * -1;
        } else if ((fary) < 0) {
            fary = fary * -1;
        }

        sum = ((int) Math.pow(farx, 2)) + ((int) Math.pow(fary, 2));

        farFromHere = (float) Math.sqrt(sum);
        System.out.println("주유소까지 거리는 :" + farFromHere);

    }
    public void printevery(){
        int cntMax = 4;
        for (int j = 0; j < cntMax; j++) {
            arr[j] = (int) farFromHere;

            if (arr[0] < arr[1] && arr[0] < arr[2] && arr[0] < arr[3]) {
                System.out.println("1번 주유소로 가자!");
            } else if (arr[1] < arr[0] && arr[1] < arr[2] && arr[1] < arr[3]) {
                System.out.println("2번 주유소로 가자!");
            } else if (arr[2] < arr[0] && arr[2] < arr[1] && arr[0] < arr[3]) {
                System.out.println("3번 주유소로 가자!");
            } else if (arr[3] < arr[0] && arr[3] < arr[1] && arr[3] < arr[2]) {
                System.out.println("4번 주유소로 가자!");
            }
        }
    }
}
*/

    int x;
    int y;
    int myx;
    int myy;
    int farx;
    int fary;
    int sum;
    int[] arr;
    int[] gasstationx;
    int[] gasstationy;
    int[] duparr;
    float farFromHere;
    final int gasNum = 4;

    public location() {
        gasstationx = new int[gasNum];
        gasstationy = new int[gasNum];

        for (int i = 0; i < gasNum; i++) {
            gasstationx[i] = (int) (Math.random() * 100);
            gasstationy[i] = (int) (Math.random() * 100);
        }
    }

    public void myLocation() {
        myx = (int) (Math.random() * 100);
        myy = (int) (Math.random() * 100);
        System.out.printf("나의 현재좌표 : (%2d,%2d)\n", myx, myy);
    }

    public void gasLocation() {
        for (int i = 0; i < gasNum; i++) {
            System.out.printf("[%d]번째 주유소의 위치는 : (%2d, %2d)\n", i + 1, gasstationx[i], gasstationy[i]);
        }
    }

    public void howFar() {

        for (int i = 0; i < gasNum; i++) {
            arr = new int[gasNum];
            farx = myx - gasstationx[i];
            fary = myy - gasstationy[i];
            if ((farx) < 0) {
                farx = farx * -1;
            } else if ((fary) < 0) {
                fary = fary * -1;
            }

            sum = ((int) Math.pow(farx, 2)) + ((int) Math.pow(fary, 2));

            farFromHere = (float) Math.sqrt(sum);
            arr[i] = (int) farFromHere;

            System.out.printf("[%d}번 주유소까지 거리는 :" + farFromHere + "\n", i + 1);
            System.out.println(arr[i]);
        }
    }

    public void closeOne() {

        int min = arr[0];
        for (int i = 0; i < gasNum; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            System.out.println(min);
        }
    }

}
        //        int min = arr[0];
//        for (int i=0; i<arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//        System.out.println(min);

    /*
    public void howFar() {

        farFromHere = 0;
        myx = (int) (Math.random() * 100);
        myy = (int) (Math.random() * 100);
        System.out.printf("나의 현재좌표 : (%2d,%2d)\n", myx, myy);

        for (int i = 0; i < cntMax; i++) {
            gasstationx[i] = (int) (Math.random() * 100);
            gasstationy[i] = (int) (Math.random() * 100);
            System.out.printf("[%d]번째 주유소의 위치는 : (%2d, %2d)\n", i + 1, gasstationx[i], gasstationy[i]);
//            gasstationx[i] = x;
//            gasstationx[i] = y;

            farx = myx - gasstationx[i];
            fary = myy - gasstationy[i];
            if ((farx) < 0) {
                farx = farx * -1;
            } else if ((fary) < 0) {
                fary = fary * -1;
            }

            sum = ((int) Math.pow(farx, 2)) + ((int) Math.pow(fary, 2));

            farFromHere = (float) Math.sqrt(sum);
            System.out.println("주유소까지 거리는 :" + farFromHere);



            }


        }

 */


//    public int destination() {
//        for (int cnt = 0; cnt < cntMax; cnt++) {
//            x = (int) (Math.random() * 100);
//            y = (int) (Math.random() * 100);
//            //System.out.printf("4차원 세계의 주유소들의 좌표 :[%d] (%2d,%2d)\n",cnt+1 , x, y);
//            //결과값들을 어떻게 빼올 것인가...
//        }
//        return howFar;
//    }
//
//
//
//    //위아래 매소드에 x와 y값을 랜덤으로 하기위해서 매소드 마다 x,y를 랜덤으로 설정해줘야하는데
//    //이걸 클래스의 변수 선언에 넣어버리면 같은 랜덤값이 설정된다.
//
//    //destination의 x,y myloc의 x,y를 각각 빼고 그둘을 더해서 /2가 가장작은것.
//    public int myLocation(){
//        myx = (int) (Math.random() * 100);
//        myy = (int) (Math.random() * 100);
//        System.out.printf("나의 현재좌표 : (%2d,%2d)\n", myx, myy);
//    }
//      math.pow(


    public class Forteenth {
        //현재 차량을 타고 운전중이다.
        //기름이 떨어져서 주유소에 들려야 한다.
        //우리가 사는 세계가 아닌 다른 4차원의 세계라 지도상에 주유소의 x 좌표, y 좌표가 랜덤하게 출력된다.
        //한 번 나타난 좌표는 사라지지 않는다.
        //이 정보를 기반으로 가장 가까운 거리의 주유소를 찾도록 프로그램을 작성해보자! (현재 내 좌표도 랜덤으로 설정하도록 한다)
        public static void main(String[] args) {
            location xy = new location();

            xy.myLocation();
            xy.gasLocation();
            xy.howFar();
            xy.closeOne();
        }
    }

