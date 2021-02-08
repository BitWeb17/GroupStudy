package com.example.homwork.randteam;

import java.util.ArrayList;

// 랜덤 팀 구성 하기
 // 1. 생성자 만들기 (나눌 팀숫자와, 사람 이름들어간 어레이 리스트가 가물가물하니 연습겸 써보자)
 // -- 필요 변수: 팀갯수/1개의 어레이 리스트/ 사람수(배열길이).
 // -- arr이는 출력 부분에서 적어보자
 // 2. 랜덤 섞기(중복 없이)
 // 3. 프린트 메소드 만들기 -n개의 팀으로 나누기 ->나머지가 있을때와 없을때 두가지경우의 대비하기
public class RandomTeam {
    private int teamNum;
    private int numOfPerson;
    ArrayList<Object> teamArrayList;
    String [] name;
    private final int ZERO =0;
    

    public RandomTeam(String [] name, int teamNum){
        this.name = name;
        this.teamNum = teamNum;
        this.numOfPerson = name.length;
        teamArrayList = new ArrayList<Object>();
    }
    public void allocRandTeam (){
        boolean isDup = false;

        for(int i = ZERO; i < numOfPerson; i++) {
            do {
                int randNum = (int)(Math.random() * numOfPerson);

                if(teamArrayList.contains(name[randNum])) {
                    isDup = true;
                    continue;
                } else {
                    isDup = false;
                }

                teamArrayList.add(name[randNum]);
            } while(isDup);
        }
        System.out.println(teamArrayList);
    }
    public void printArr(){
        int size = teamArrayList.size();
        int pre = size / teamNum;
        int last = size % teamNum;
        ArrayList<Object> finalArr= new ArrayList<Object>();
        
        if(size <= pre){
            finalArr.add(teamArrayList);
        }else{
            for(int i = ZERO; i < pre; i++){
                ArrayList<Object> resArr = new ArrayList<Object>();
                for(int j =ZERO; j < teamNum; j++){
                    resArr.add(teamArrayList.get(i*pre+j));
                }
                finalArr.add(resArr);
        }
    }
    if(last > 0){
        for(int k = ZERO; k < last; k++){
            ArrayList<Object> resArr = new ArrayList<Object>();
            resArr.add(teamArrayList.get(pre * teamNum + k));
            finalArr.add(resArr);
        }
    }
    System.out.println("sss"+ finalArr);
}
}
