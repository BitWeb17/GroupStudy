class OneToTen {

    final int TEN = 10;

    public void PrintTen() {
        for(int i = 1; i <= TEN; i++) {
            System.out.print(i+", ");
        }
    }
}

public class Ex01 {
    public static void main(String[] args) {
        OneToTen ott = new OneToTen();
        System.out.print("1 ~ 10까지 출력하시오: ");
        ott.PrintTen();
    }
}
