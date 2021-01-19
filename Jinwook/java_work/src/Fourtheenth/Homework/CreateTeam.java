package Fourtheenth.Homework;

import java.util.ArrayList;
import java.util.Iterator;


public class CreateTeam {
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
        //여기다 랜덤으로 나눌것을 추가? int divNum
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
        //똑같이 랜덤으로 나눌것을 추가?
        String name;

        Iterator e = al.iterator();
        int cnt = 1;
        int addNum = 0;
        int quot = al.size() / numOfTeam;
        int remain = al.size() % numOfTeam;
        boolean needException =
                (remain > 0) ? true : false;


        while(e.hasNext()) {
            name = (String) e.next();
            System.out.printf("%s ", name);

            if(needException) {

               /// 여기다 추가할것;
                needException = false;
            }




            if((cnt % quot) == 0) {
                System.out.println("");

            }

            cnt++;
        }

        System.out.println("");
    }


    public ArrayList<String> getTeamArrayList() {
        return teamArrayList;
}
}