class SumOneToTen {

    final int TEN = 10;
    int sum = 0;

    public void PrintSum() {
        for(int i = 1; i <= TEN; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}

public class Ex02 {
    public static void main(String[] args) {
        SumOneToTen sott = new SumOneToTen();
        System.out.print("1 ~ 10까지의 합: ");
        sott.PrintSum();
    }
}
