package Thirteenth;

import java.util.ArrayList;
import java.util.Iterator;

public class Ticketing {
    private int numOfHuman; // 사람 수 변수 셋팅
    private int numOfTicket; // 티켓 수 변수 셋팅

    private int[] personNumberArr;  //사람 수 셋팅
    private int[] ticketNumberArr;  // 티켓 수 셋팅

    private ArrayList<Integer> personArrayList;     // 컬렉션 Integer 형 personArrayList 셋팅???
    private ArrayList<Integer> ticketArrayList;     //??

    public Ticketing(int numOfHuman, int numOfTicket) {
        this.numOfHuman = numOfHuman;
        this.numOfTicket = numOfTicket;

        // 사실 현재 케이스에서는 배열만 쓰거나
        // ArrayList만 쓰는것이 좋지만
        // 약간 손 볼 곳이 많으므로
        // 그냥 둘 다 할당하도록 한다.
        personNumberArr = new int[50];      // personNumberArr 사람 수 50개 배열 셋팅
        ticketNumberArr = new int[20];      // ticketNumberArr 티켓 수 20개 배열 셋팅

        personArrayList = new ArrayList<Integer>();
        ticketArrayList = new ArrayList<Integer>();
    }

    public int allocRandomPersonNumber() {
        boolean isDup = false;
        int randNum;

        do {
            randNum = (int) (Math.random() * 50);

            if (personNumberArr[randNum] != 0) {
                isDup = true;
            } else {
                isDup = false;
                personNumberArr[randNum] = 1;
            }
        } while(isDup);

        return randNum;
    }

    public void allocTicket(int personNum) {
        boolean isDup = false;
        int randNum;

        do {
            randNum = (int) (Math.random() * 20) + 1;

            if (ticketNumberArr[randNum - 1] != 0) {
                isDup = true;
            } else {
                isDup = false;
                ticketNumberArr[randNum - 1] = personNum;
            }
        } while(isDup);
    }

    public void ticketingTicket() {
        // 1) 랜덤한 중복되지 않는 0 ~ 49까지의 값으로 사람 번호 매기기
        // 2) 랜덤한 중복되지 않는 0 ~ 19까지의 값으로 예매하기
        int personNum;
        //int cnt = 1;

        for(int i = 0; i < numOfTicket; i++) {
            personNum = allocRandomPersonNumber();
            //System.out.printf("%3d", personNum);

            //if(cnt % 5 == 0) {
            //    System.out.println("");
            //}

            //cnt++;

            allocTicket(personNum);
        }
    }

    public int allocArrayListRandomPersonNumber() {
        boolean isDup = false;
        int randNum;

        do {
            randNum = (int) (Math.random() * 50);

            // 현재 ArrayList에 randNum이 있나요 ?
            if (personArrayList.contains(randNum)) {
                isDup = true;
            } else {
                isDup = false;
                personArrayList.add(randNum);
            }
        } while(isDup);

        return randNum;
    }

    public void ticketingArrayListTicket() {
        int personNum;

        for(int i = 0; i < numOfTicket; i++) {
            personNum = allocArrayListRandomPersonNumber();

            ticketArrayList.add(personNum);
        }
    }

    /*
    public void printPersonNumber() {
        int cnt = 1;
        for(int i = 0; i < personNumberArr.length; i++) {
            System.out.printf("%3d", personNumberArr[i]);
            if(cnt % 5 == 0) {
                System.out.println("");
            }
            cnt++;
        }
    }
     */

    public void printTicketArrayList() {
        int cnt = 1;
        Integer ticketNum;

        Iterator e = ticketArrayList.iterator();

        while(e.hasNext()) {
            ticketNum = (Integer) e.next();
            System.out.printf("%3d", ticketNum);

            if(cnt % 5 == 0) {
                System.out.println("");
            }

            cnt++;
        }
    }

    public void printArr(int[] arr) {
        int cnt = 1;

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i] + 1);

            if(cnt % 5 == 0) {
                System.out.println("");
            }

            cnt++;
        }
    }

    public int[] getPersonNumberArr() {
        return personNumberArr;
    }

    public int[] getTicketNumberArr() {
        return ticketNumberArr;
    }
}