package com.example.demo.TeamDivide;

import java.util.ArrayList;
import java.util.Iterator;

public class TeamDivide {

    private ArrayList<String> AteamArrayList;
    private ArrayList<String> BteamArrayList;

    private String[] AteamArr;
    private String[] BteamArr;

    private int AnumOfPerson;
    private int numOfTeam;

    private int BnumOfPerson;

    public TeamDivide() {
        final int TEAMNUMBER = 2;
        String[] nameA = {
                "고동영", "장해솔", "류슬기", "박재민", "한다은",
                "최현정", "오진욱", "조진형", "이정현"
        };
        String[] nameB = {
                "이범진", "박소현", "탁성진", "노찬욱",
                "박기범", "하진주", "이승윤", "최임식"
        };
        AteamArr = nameA;  //----nameA 의 {}값
        BteamArr = nameB;

        AnumOfPerson = nameA.length;  //--9
        BnumOfPerson = nameB.length;

        numOfTeam = TEAMNUMBER;

        AteamArrayList = new ArrayList<String>(); // ** 이건 왜 굳이 public 안에 넣어야되나?
        BteamArrayList = new ArrayList<String>();
        allocArrayList(
                //  {}의값 상자?   , 배열[0~8]의방들, 방들의 갯수 9
                AteamArrayList, AteamArr, AnumOfPerson
        );
        allocArrayList(
                BteamArrayList, BteamArr, BnumOfPerson
        );
    }

    public void allocArrayList(ArrayList<String> al, String[] arr, int loopNum) {

        boolean isDup = false;

        for (int i = 0; i < loopNum; i++) {
            // 우리는 A 배열, B 배열이 나눠진 케이스를 받으므로
            // 하나의 배열에서 모든 값을 처리하지 않는다.
            // 그러므로 start를 별도로 만들 필요가 없었다.
            // int randNum = (int)(Math.random() * loopNum) + start;
            do {
                int randNum = (int) (Math.random() * loopNum);//--0~8

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

    public void printTeam(ArrayList<String> al) {
        String name;
        Iterator e = al.iterator();

        int cnt = 1;
        int divNum;
        int quot = al.size() / numOfTeam;
        int remain = al.size() % numOfTeam;
        boolean needException =
                (remain > 0) ? true : false;

        int randValue = 0;
        while (e.hasNext()) {
            name = (String) e.next();
            System.out.printf("%s ", name);
            if (needException) {
                randValue = (int) (Math.random() * 2);  //---0,1
                needException = false;
            }
            if ((cnt % (quot + randValue)) == 0) {
                System.out.println("");

                if (cnt == 4) {
                    randValue = 1;
                } else {
                    randValue = 0;
                }
                cnt = 0;
            }
            cnt++;
        }
        System.out.println("");
    }

    public ArrayList<String> getAteamArrayList() {
        return AteamArrayList;
    }

    public ArrayList<String> getBteamArrayList() {
        return BteamArrayList;
    }
}

