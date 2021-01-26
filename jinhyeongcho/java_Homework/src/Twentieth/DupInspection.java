package Twentieth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class DupInspection {
    int [] randNum;
    int i;
    ArrayList<Integer> str = new ArrayList<>();
    HashSet<Integer> hs = new HashSet<>();



    public void numberSet(int setNum){
        randNum =new int[setNum];
        for (i =0 ;i< randNum.length;i++){
            randNum[i]=(int)(Math.random()*41)+20;
            System.out.printf("%d번 배열 수:%d\n",i,randNum[i]);
            str.add(randNum[i]);

        }
    }


    public void hashNum(){
        for (Integer dup : str){
            hs.add(dup);
        }
        System.out.println("이게 중복된 값= "+hs);
    }

    public void hashDup(){
      /*  int totalNum=0;
        for (i = 0;i< randNum.length;i++){

            for (int j=20; j<61;j++){
                if(randNum[i]==j){

                 totalNum++;

                }
                System.out.printf("%d값 중복된 수 = %d\n",j,totalNum);
            }
        }*/


        Iterator e = str.iterator();
        Iterator s = hs.iterator();
        System.out.println(e.equals(s));

    }

}
