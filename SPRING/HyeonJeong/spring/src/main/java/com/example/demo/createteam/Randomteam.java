package com.example.demo.createteam;

import java.util.ArrayList;

public class Randomteam {
    private ArrayList<String> joArraylist;

    private String[] joArray;

    private int joPersonNumber;

    private int numberOfTeams;

    public Randomteam(String[] jo, final int NUMBER_OF_TEAMS) {
        joArray = jo;
        joPersonNumber = jo.length;
        joArraylist = new ArrayList<String>();

        numberOfTeams = NUMBER_OF_TEAMS;
    }

    public void setRandomJo() {
        setArraylist(joArraylist, joArray, joPersonNumber);
    }

    public void setArraylist(
            ArrayList<String> joArraylist,
            String[] joArray, int joRepeatNumber) {

        boolean is_repeat_number;

        for (int i = 0; i < joRepeatNumber; i++) {
            is_repeat_number = true;

            while (is_repeat_number) {
                int random_number = (int) (Math.random() * joRepeatNumber);

                if (joArraylist.contains(joArray[random_number])) {
                    continue;
                } else {
                    is_repeat_number = false;
                }
                joArraylist.add(joArray[random_number]);
            }
        }
    }

    public void printArraylist(ArrayList<String> joArraylist) {
        String[] nameOfJo =
                joArraylist.toArray(new String[joArraylist.size()]);
        // 최적화를 위해 ArrayList를 Array로 변환

        int peopleOfJo = nameOfJo.length;

        int numberOfMembers = // 한 팀에 들어가는 멤버의 수
                (peopleOfJo / numberOfTeams);

        if (numberOfMembers == 0) {
            System.out.printf("ㅍㅅㅍ? %d 팀? %d 명으로?\n", numberOfTeams, peopleOfJo);
            // 팀을 나눌 수 없을 경우 출력 되는 메세지
            return;
        }

        int teamNo = 0;
        int id = 0;

        while (true) {
            if (id > peopleOfJo - 1) {
                // id는 인덱스임으로 0부터 시작
                // people_of_jo는 1부터 시작하기 때문에 -1
                break;
            }

            teamNo = id / numberOfMembers;

            if (teamNo > numberOfTeams - 1) {
                // 위와 같은 이유이다.
                break;
            }

            System.out.printf("[%s]", nameOfJo[id]);

            if (id % numberOfMembers == numberOfMembers - 1) {
                // 출력결과를 편하게 보기 위한 코드
                System.out.println("");
                System.out.println("");
            }
            id++;
        }

        System.out.println("<< 남은사람들 >>\n");

        teamNo = 0;
        int remained = peopleOfJo - id;
        // 전체 사람 수에서 팀을 결성한 사람을 뺀 남은 사람
        while (remained-- > 0) {
            System.out.printf("[%s] %d팀 \n", nameOfJo[id], teamNo +1);
            // 남은 사람들을 팀에 한명씩 넣어준다.
            id++;
            teamNo++;
        }
        System.out.println("--------------------------\n");
    }

    public ArrayList<String> getJoArraylist() {
        return joArraylist;
    }

}
