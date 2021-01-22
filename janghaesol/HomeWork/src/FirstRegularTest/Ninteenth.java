package FirstRegularTest;

import java.util.ArrayList;

class randomPick{
    int randNum;
    int[] randArr;
    ArrayList<Integer> jNum = new ArrayList<Integer>();
    ArrayList<Integer> hNum = new ArrayList<Integer>();

    public void pickRandArr(){
        randArr = new int[7];
        for(int i = 0; i < randArr.length; i++){
            randNum = (int)(Math.random()*50)+1;
            if(randNum % 2 == 1){
                hNum.add(randNum);
            }else{
                jNum.add(randNum);
            }
            System.out.printf("[%d]공간의 값은 : %d\n",i,randNum);
        }
    }
    public void jjakhol(){
        System.out.print("출력된 배열의 값 중에 홀수는 :");
        System.out.println(hNum);
        System.out.print("출력된 배열의 값 중에 짟수는 :");
        System.out.println(jNum);
    }
}

public class Ninteenth {
    public static void main(String[] args) {
        randomPick rp = new randomPick();

        rp.pickRandArr();
        rp.jjakhol();
    }
}
