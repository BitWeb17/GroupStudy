class multi2 {

    final int TWENTY = 20;

    public void PrintMulti() {
        for(int i = 1; i <= TWENTY; i++) {
             if(i % 2 == 0){ // 2의 배수
                 System.out.print(i+", ");
             }
        }
    }
}

public class Ex03 {
    public static void main(String[] args) {
        multi2 mul2 = new multi2();
        System.out.println("1 ~ 20까지 중 2의 배수");
        mul2.PrintMulti();
    }
}
