// 패키지 유의해서 넣어주기
package com.example.study210205.controller;

import java.util.ArrayList;
import java.util.Iterator;

public class Team {

    private ArrayList<String> AteamArrList;
    private ArrayList<String> BteamArrList;

    private String[] AteamArr;
    private String[] BteamArr;

    private int AnumOfPerson;
    private int BnumOfPerson;

    private int numOfTeam;

    boolean needException;

    public Team(String[] arrA) {
        AteamArr = arrA;
    }

    public Team(String[] arrA, String[] arrB, final int TEAMNUMBER) {
        AteamArr = arrA;
        BteamArr = arrB;

        AnumOfPerson = arrA.length;
        BnumOfPerson = arrB.length;

        numOfTeam = TEAMNUMBER;

        AteamArrList = new ArrayList<>();
        BteamArrList = new ArrayList<>();
    }

    public void allocRandTeam() {
        allocArrayList(AteamArrList, AteamArr, AnumOfPerson);
        allocArrayList(BteamArrList, BteamArr, BnumOfPerson);
    }

    public void allocArrayList(ArrayList<String> al, String[] arr, int loopNum) {

        boolean isDup = false;

        for (int i = 0; i < loopNum; i++) {
            // 랜덤하게 수 배치
            // 포함하고 있다면 true 포함하고 있지 않다면 false
            do {
                int randNum = (int) (Math.random() * loopNum);
                if (al.contains(arr[randNum])) {
                    isDup = true;
                    continue;
                } else {
                    isDup = false;
                    al.add(arr[randNum]);
                }
            } while (isDup);
        }
    }

    public void printArrList(ArrayList<String> al) {

        Iterator<String> e = al.iterator();
        String name;
        int cnt = 1;
        int quot = al.size() / numOfTeam;
        int remain = al.size() % numOfTeam;
        boolean needException = (remain > 0) ? true : false;
        int randValue = 0;

        while (e.hasNext()) {
            name = (String) e.next();
            System.out.printf("%s", name);

            if (needException) {
                randValue = (int) (Math.random() * 2);
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

    public ArrayList<String> getAteamArrList() {
        return this.AteamArrList;
    }

    public ArrayList<String> getBteamArrList() {
        return this.BteamArrList;
    }

}