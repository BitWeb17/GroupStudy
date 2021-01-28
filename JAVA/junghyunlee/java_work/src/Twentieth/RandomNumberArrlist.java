package Twentieth;

import java.util.ArrayList;
import java.util.HashMap;

public class RandomNumberArrlist {
    int[] num = new int[200];
    private static Integer[] totalNum;
    private int cnt = 1;

    public RandomNumberArrlist() {
    }

    public void printRandomNum(){
        ArrayList<Integer> list = new <Integer>ArrayList();

        for(int i = 0; i < num.length; i++) {
            list.add((int)(Math.random() * 40) + 20);

            for(int totalNum : list);
        }

        System.out.println("리스트 값 = " + list);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer a : list) map.put(a, map.getOrDefault(a, 0) + 1);
        System.out.println("출력 결과 : " + map);
    }
}
