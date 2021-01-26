package Twentieth;

import java.util.ArrayList;
import java.util.List;

public class DupInspection {
    int [] randNum;
    int i;
    ArrayList<Integer> str = new ArrayList<>();

    public void numberSet(int setNum){
        int cnt = 0;
        randNum =new int[setNum];
        for (i =0 ;i< randNum.length;i++){
            randNum[i]=(int)(Math.random()*41)+20;
            //System.out.printf("%d번 배열 수:%d\n",i,randNum[i]);
            str.add(randNum[i]);
         /*   for (int j =0;j<str.size();j++){
                if(str.get(i).equals(str.get(j))){
                    cnt++;

                }
            }*/

        }
        System.out.println("실험값 :" +str);


    }

}
