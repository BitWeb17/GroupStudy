class multi2and3 {

    final int TWENTY = 20;

    public void multi2and3print() {
        for(int i = 1; i <= TWENTY; i++) {
            if((i % 2 == 0)&&(i % 3 == 0)) { //2의 배수 그리고 3의 배수
                System.out.print(i+", ");
            }
        }
    }
}

public class Ex04 {
    public static void main(String[] args) {
        multi2and3 mul23 = new multi2and3();
        System.out.print("1 ~ 20 사이, 2와 3의 배수: ");
        mul23.multi2and3print();
    }
}
