package Seventh;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int cnt = 0;
        for(int i = 1; i < 101; i++) {

            if (cnt % 10 == 0) {
                //System.out.println("");
            }
            cnt++;
            System.out.printf("%4d", cnt);
        }
    }
}
