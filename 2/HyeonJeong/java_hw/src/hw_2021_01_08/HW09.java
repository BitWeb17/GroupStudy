package hw_2021_01_08;

class nClass {
    public final int STUDENTS = 30;
    public final int CLASSES = 3;
    int[] a_class; // 총 학급의 개수
    int[] score; // 점수를 저장할 배열
    int classNum; // n반
    int[] a_classSum; // 학급 점수의 총합 배열
    float[] average; // 학급평균
    float[] variance; // 학급분산
    float[] standardDeviation; // 학급표준편차

    public nClass(int class_No) {
        this.classNum = class_No;
        score = new int[STUDENTS];

        for (int i = 0; i < score.length; i++) {
            score[i] = (int) (Math.random() * 61) + 40;
        }
    }

    public void a_classAverage(int class_No) {
        for (int i = 0; i < score.length; i++) {
            score[i] = (int) (Math.random() * 61) + 40;
            a_classSum[class_No] += score[i];
        }
        average[class_No] = a_classSum[class_No] / (float)STUDENTS;
    }

    public void a_class_variance(int class_No) {

    }

    public void a_classs_tandardDeviation(int class_No) {

    }

}

public class HW09 {
}
