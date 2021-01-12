package Ninth_2021_01_11;

class WorkRate {
    final int DAYHOUR = 24;

    float rateA;
    float rateB;
    float completeHour;
    float amount_Of_Work;

    int requireDay;
    int requireHousr;
    int requireMinute;




    public WorkRate(float hourA, float productionA,
                    float hourB, float productionB, int day) {

        rateA = productionA / hourA;
        rateB = productionB / hourB;
        completeHour = day * DAY;
        amount_Of_Work = (rateA + rateB) * completeHour;
    }

    public float calculator_Progress(int accidendDay) {
        fireStop(rateA, 3);

        return amount_Of_Work / (rateA + rateB);
    }

    public void fireStop(float rate, int day) {
        amount_Of_Work -= rateB * day * DAYHOUR;
    }

    public void print_Cnversion_Hour_2_ComfortFormat() {
        requireDay = (int)totalHour /24;
        requireHousr = (int)totalHour /24;
        requireMinute = ((int)totalHour * 10 % 10) * 6;

        System.out.printf("완성일은 앞으로 %d일, %d시간 %d분이 " +
                "더 필요할 것으로 추정되고 있습니다.\n",requireDay ,requireHousr, requireMinute);
    }

    public void print_amount_Of_Work() {
        System.out.printf("A의 작업률 = %d\n",rateA);
        System.out.printf("B의 작업률 = %d\n",rateB);
        System.out.printf("총 작업량 = %d\n",amount_Of_Work);
    }

}

public class HW12_Answer {
    public static void main(String[] args) {
        WorkRate wr = new WorkRate(
                10, 100, 20, 50);

        wr.print_InFo();

        System.out.printf("사고 발생시 걸리는 시간 = %d\n");
        wr.


    }
}
