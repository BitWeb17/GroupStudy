package com.example.demo.randomPick;

import java.util.ArrayList;
import java.util.HashSet;

public class RandomPick {
    // Test 20
    static final int TRANSFER = 1;
    static final int TRANSFERTO = 2;

    private final int EXCEPTION = 1;

    private HashSet<String>[] hashSetArr;
    private HashSet<String>[] hashSetArr_A;
    private HashSet<String>[] hashSetArr_B;

    private ArrayList<String> studentArrList;
    private ArrayList<String> groupA_ArrList;
    private ArrayList<String> groupB_ArrList;


    private String[] studentArr;
    private String[] groupA_Arr;
    private String[] groupB_Arr;

    private int totalLen;
    private int A_Len;
    private int B_Len;

    private int teamNum;
    private int defaultNum;
    private int remains;

    // ArrayList를 통한 전입/전출생 관리
    public RandomPick(int teamNum, ArrayList<String> studentArrList, String targetStudent, int ORDER) {

        switch (ORDER) {
            case TRANSFER:
                studentArrList.add(targetStudent);
                break;

            case TRANSFERTO:
                studentArrList.remove(targetStudent);
        }

        this.teamNum = teamNum;
        this.studentArrList = studentArrList;

        totalLen = studentArrList.size();

        hashSetArr = new HashSet[teamNum];

        defaultNum = totalLen / teamNum;
        remains = totalLen % teamNum;

        for (int i = 0; i < (teamNum); i++) {
            hashSetArr[i] = new HashSet<String>();
        }
    }

    // ArrayList로 받는 경우
    public RandomPick(int teamNum, ArrayList<String> studentArrList) {
        this.teamNum = teamNum;
        this.studentArrList = studentArrList;

        totalLen = studentArrList.size();

        hashSetArr = new HashSet[teamNum];

        defaultNum = totalLen / teamNum;
        remains = totalLen % teamNum;

        for (int i = 0; i < (teamNum); i++) {
            hashSetArr[i] = new HashSet<String>();
        }
    }

    // 배열로 받는 경우
    public RandomPick(int teamNum, String[] studentArr) {
        this.teamNum = teamNum;
        this.studentArr = studentArr;

        totalLen = studentArr.length;

        hashSetArr = new HashSet[teamNum];

        defaultNum = totalLen / teamNum;
        remains = totalLen % teamNum;

        for (int i = 0; i < (teamNum); i++) {
            hashSetArr[i] = new HashSet<String>();
        }
    }

    // 배열 - 특별한 경우: 비대면의 경우 A조 B조로 나눔
    public RandomPick(int teamNum, String[] groupA, String[] groupB) {
        this.teamNum = teamNum;
        this.groupA_Arr = groupA;
        this.groupB_Arr = groupB;

        hashSetArr_A = new HashSet[teamNum];
        hashSetArr_B = new HashSet[teamNum];

        A_Len = groupA_Arr.length;
        B_Len = groupB_Arr.length;

        defaultNum = A_Len / teamNum;
        remains = A_Len % teamNum;

        for (int i = 0; i < teamNum; i++) {
            hashSetArr_A[i] = new HashSet<String>();
            hashSetArr_B[i] = new HashSet<String>();
        }
    }

    // ArrayList - 특별한 경우: 비대면의 경우 A조 B조로 나눔
    public RandomPick(int teamNum, ArrayList<String> groupA_ArrList, ArrayList<String> groupB_ArrList) {
        this.teamNum = teamNum;
        this.groupA_ArrList = groupA_ArrList;
        this.groupB_ArrList = groupB_ArrList;

        hashSetArr_A = new HashSet[teamNum];
        hashSetArr_B = new HashSet[teamNum];

        A_Len = groupB_ArrList.size();
        B_Len = groupB_ArrList.size();

        defaultNum = A_Len / teamNum;
        remains = A_Len % teamNum;

        for (int i = 0; i < teamNum; i++) {
            hashSetArr_A[i] = new HashSet<String>();
            hashSetArr_B[i] = new HashSet<String>();
        }
    }

    // ArrayList - 랜덤팀 배정 메서드
    public void rndAlloc(ArrayList<String> arrayList, HashSet<String>[] hashSetArr) {
        boolean isDup = false;

        for (int i = 0;;) {
            int randStudent = (int)(Math.random() * arrayList.size());

            for (int j = 0; j < teamNum; j++) {
                isDup = hashSetArr[j].contains(arrayList.get(randStudent));

                if (isDup) break;
            }
            if (isDup) continue;

            hashSetArr[i].add(arrayList.get(randStudent));

            if (hashSetArr[i].size() == defaultNum) i++;
            if (i == teamNum) break;
        }
    }

    // 배열 - 랜덤팀 배정 메서드
    public void rndAlloc(String[] arr, HashSet<String>[] hashSetArr) {
        boolean isDup = false;

        for (int i = 0;;) {
            int randStudent = (int)(Math.random() * arr.length);

            for (int j = 0; j < teamNum; j++) {
                isDup = hashSetArr[j].contains(arr[randStudent]);

                if (isDup) break;
            }
            if (isDup) continue;

            hashSetArr[i].add(arr[randStudent]);

            if (hashSetArr[i].size() == defaultNum) i++;
            if (i == teamNum) break;
        }
    }

    // ArrayList - 예외 인원 배정 메서드
    public void allocRemain(ArrayList<String> arrayList, HashSet<String>[] hashSetArr) {
        if (remains > 0) {
            boolean isDup = false;

            for (; ; ) {
                int randStudent = (int) (Math.random() * arrayList.size());

                for (int j = 0; j < teamNum; j++) {
                    isDup = hashSetArr[j].contains(arrayList.get(randStudent));

                    if (isDup) break;
                }
                if (isDup) continue;

                int randTeam = (int) (Math.random() * teamNum);
                if (hashSetArr[randTeam].size() == defaultNum + EXCEPTION) continue;
                hashSetArr[randTeam].add(arrayList.get(randStudent));

                remains--;

                if (remains == 0) break;
            }
        }
    }

    // 배열 - 예외 인원 배정 메서드
    public void allocRemain(String[] arr, HashSet<String>[] hashSetArr) {
        if (remains > 0) {
            boolean isDup = false;

            for (; ; ) {
                int randStudent = (int) (Math.random() * arr.length);

                for (int j = 0; j < teamNum; j++) {
                    isDup = hashSetArr[j].contains(arr[randStudent]);

                    if (isDup) break;
                }
                if (isDup) continue;

                int randTeam = (int) (Math.random() * teamNum);
                if (hashSetArr[randTeam].size() == defaultNum + EXCEPTION) continue;
                hashSetArr[randTeam].add(arr[randStudent]);

                remains--;

                if (remains == 0) break;
            }
        }
    }

    public HashSet<String>[] getHashSetArr_B() {
        return hashSetArr_B;
    }

    public HashSet<String>[] getHashSetArr() {
        return hashSetArr;
    }

    public HashSet<String>[] getHashSetArr_A() {
        return hashSetArr_A;
    }

    public void print(HashSet<String>[] hashSetArr) {
        int i;
        int cnt = teamNum;

        if (hashSetArr == hashSetArr_B) {

            for (i = 0; i < teamNum; i++) {

                System.out.printf("%d팀: " + hashSetArr[i] + "\n", ++cnt);
            }
            return;
        }

        for (i = 0; i < teamNum; i++) {

            System.out.printf("%d팀: " + hashSetArr[i] + "\n", i + 1);
        }
    }
}