package Homework.Thirteenth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomTeam {
    private ArrayList<String> name;
    private ArrayList<Integer> randomNumber;
    private Set<String> s1, s2;
    private int count;

    public RandomTeam(ArrayList<String> name, int count) {
        s1 = new HashSet<String>();
        s2 = new HashSet<String>();
        randomNumber = new ArrayList<Integer>();

        this.name = name;
        this.count = count;
    }

    public boolean isDup(int num) {
        // 랜덤 수가 중복되는지 확인 후 참, 거짓 값 반환
        return randomNumber.contains(num);
    }

    public int randomExtraction() {
        int randNum;
        boolean checkDup = false;

        // 랜덤 수가 중복되지 않을 때까지 반복
        do {
            // 조 인원 수 범위 내 랜덤 수 추출
            randNum = (int) (Math.random() * count);

            // 기존 랜덤 수와 중복되지 않는다면
            if (isDup(randNum)) {
                checkDup = true;
            } else {
                checkDup = false;

                // ArrayList randomNumber 에 랜덤 수 저장
                randomNumber.add(randNum);
            }
        } while (checkDup);

        // 랜덤 수 반환
        return randNum;
    }

    public void setTeam() {
        // 조원 수만큼 반복
        for (int i = 0; i < count; i++) {
            // A조 : 5명, 4명
            // B조 : 4명, 4명
            // 팀을 나누기 위하여 if 문 실행
            if (i < 4) {
                // name ArrayList 에서
                // randomExrtraction 을 통해 추출된
                // 랜덤 수 위치에 있는 인원을
                // Set s2 에 저장
                s2.add(name.get(randomExtraction()));
            } else {
                // Set s1 에 저장
                s1.add(name.get(randomExtraction()));
            }
        }
    }

    public void removeName() {
        // A조 두 팀의 인원 통합 (합집합)
        ArrayList<String> union = new ArrayList<>(s1);
        union.addAll(s2);

        // 전체 수강인원에서 A조 인원 제거 (차집합)
        name.removeAll(union);

//        for (int i = 0; i < count; i++) {
//            name.remove(0);
//        }
    }

    public void printTeam() {
        // 총원 출력 (기존 for 문 형식 이용)
        System.out.printf("총원 %d명 : ", count);
        for (int i = 0; i < count; i++) {
            System.out.printf("%s ", name.get(i));
        }
        System.out.println();

        // 1팀 출력 (Iterator 이용)
        String str1;
        Iterator e1 = s1.iterator();

        System.out.print("1팀 : ");
        while (e1.hasNext()) {
            str1 = (String) e1.next();
            System.out.printf("%s ", str1);
        }
        System.out.println();

        // 2팀 출력 (새로운 for 문 형식 이용)
        System.out.print("2팀 : ");
        for (String str2 : s2) {
            System.out.printf("%s ", str2);
        }
        System.out.println();
    }
}
