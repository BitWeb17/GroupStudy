package Eighth.HomeworkReview;
class WorkRate {
    // 12) A 공장의 생산량은 10 시간에 100개
    //     B 공장의 생산량은 20 시간에 50개다.
    //     10일간 A 공장과 B 공장이 풀 가동해야 완성되는 수량이 있다 가정한다.
    //     어느날 A 공장에 불이나서 3일간 공장이 가동 정지를 했다.
    //     그렇다면 이들은 몇 일 후에 제품을 납품할 수 있을까 ?
    final int DAYHOUR = 24;

    float rateA;
    float rateB;
    float completeHour;
    float amountOfWork;

    float totalHour;

    int requiredDay;
    int requiredHour;
    int requiredMinute;

    public WorkRate(float hourA, float productionA,
                    float hourB, float productionB, int day) {

        rateA = productionA / hourA; // A 작업률
        rateB = productionB / hourB; // b 작업률
        completeHour = day * DAYHOUR; // 완료시간
        amountOfWork = (rateA + rateB) * completeHour; // 두 공장의 작업량
    }

    public void calcRemainHour(int accidentDay) {
        //아래의 fireStop 클래스 끌어온
        fireStop(rateA, accidentDay);

        //두공장의 작업량(Amount) 를 두공장의 작업률(Rate)로 나누기 + 사고날짜 *24시간 = 총 3일이 추가된 요구되는 총 시간 알 수 있음.
        totalHour = (amountOfWork / (rateA + rateB)) +
                accidentDay * DAYHOUR;
    }

    //
    public void fireStop(float rate, int day) {

        amountOfWork -= rateB * day * DAYHOUR;
        //amountOfWork = amountOfWork -  rateB * day * DAYHOUR
        //불난 시간을 적용한 총 작업량 = 총작업량에서 3일의 B공장의 작업량을 빼면 알 수 있다.
    }

    //보기 좋게 프린트 하기 위해 생성한 메소드
    public void printConversionHour2ComfortFormat() {
        System.out.printf("전체 걸리는 시간 = %f\n", totalHour);

        // 날짜를 알아보는 식 /는 나누는
        requiredDay = (int)totalHour / 24;
        // 시간을 알아보는 식 %는 나눈 나머지를 구하는 식
        requiredHour = (int)totalHour % 24;
        // 분을 알아보는 식
        requiredMinute = ((int)(totalHour * 10) % 10) * 6;
        // 60 * 0.6 = 60 * 6 / 10

        System.out.printf("완성일은 앞으로 %d일 %d시간 %d분이 " +
                        "더 필요할 것으로 추정되고 있습니다.\n",
                requiredDay, requiredHour, requiredMinute);
    }

    public void printInfo() {
        // 총 작업량 프린트 위한 메소드(getter라고 불리는 메소드????)
        //System.out.println("A의 작업률 = " + rateA);
        //System.out.println("B의 작업률 = " + rateB);
        System.out.println("총 작업량 = " + amountOfWork);
    }
}
public class HomeworkReview12 {
    public static void main(String[] args) {
        // 12) A 공장의 생산량은 10 시간에 100개
        //     B 공장의 생산량은 20 시간에 50개다.
        //     10일간 A 공장과 B 공장이 풀 가동해야 완성되는 수량이 있다 가정한다.
        //     어느날 A 공장에 불이나서 3일간 공장이 가동 정지를 했다.
        //     그렇다면 이들은 몇 일 후에 제품을 납품할 수 있을까 ?
        WorkRate wr = new WorkRate(
                10, 100,
                20, 50, 10);

        wr.printInfo();

        wr.calcRemainHour(3);
        wr.printInfo();

        wr.printConversionHour2ComfortFormat();
    }
}
