package Fourtheenth.Homework;

import java.util.ArrayList;
import java.util.Iterator;


public class CreateTeam {
    final int RESTZERO = 1;
    final int RESTNONZERO = 2;
    private ArrayList<String> teamArrayList;

    private String[] teamArr;

    private int numOfPerson;
    private int numOfTeam;



//    public CreateTeam(String [] arr){
//        // 배열을 어레이 리스트에 저장 or 어레이 리스트에 저장
//        teamArr = arr;
//        numOfPerson = arr.length;
//        teamArrayList = new ArrayList<String>();
//    }


    public CreateTeam(String[] arr, int divNum) {
        teamArr = arr;


        numOfPerson = arr.length;
        numOfTeam = divNum;


        teamArrayList = new ArrayList<String>();

    }


    public void allocRandomTeam() {

        allocArrayList(teamArrayList, teamArr, numOfPerson);
    }


    public void allocArrayList(
            ArrayList<String> al,
            String[] arr,
            int loopNum) {
        boolean isDup = false;

        for (int i = 0; i < loopNum; i++) {

            do {
                int randNum = (int) (Math.random() * loopNum);

                if (al.contains(arr[randNum])) {
                    isDup = true;
                    continue;
                } else {
                    isDup = false;
                }

                al.add(arr[randNum]);
            } while (isDup);

        }
    }


    public void printArrayList(ArrayList<String> al) {
        String name;

        Iterator e = al.iterator();
        int cnt = 1;
        int quot = al.size() / numOfTeam;
        int remain = al.size() % numOfTeam;
        boolean needException =
                (remain > 0) ? true : false;

        int randValue = 0;

        while(e.hasNext()) {
            name = (String) e.next();
            System.out.printf("%s ", name);

            if(needException) {
                randValue = (int)(Math.random()*2);
                needException = false;
            }


            System.out.printf("cnt = %d, quot + randValue = %d , quot = %d, randvalue = %d\n",
                    cnt, quot + randValue, quot, randValue);


            if((cnt % quot) == 0) {
                System.out.println("");

//                if(cnt == quot) {
//                    randValue = 1;
//                } else {
//                    randValue = 0;
//                }
//
//                cnt = 0;
            }

            cnt++;
        }

        System.out.println("");
    }


    public ArrayList<String> getTeamArrayList() {
        return teamArrayList;
}
}