class multi2or3 {

    final int THIRTYTHREE = 33;

    public void print2or3() {
        for(int i = 3; i <= THIRTYTHREE; i++) {
            if((i % 2 == 0) || (i % 3 == 0)) { //2의 배수 이거나 3의 배수
                System.out.print(i+", ");
            }
        }
    }
}

public class Ex05 {
    public static void main(String[] args) {
        multi2or3 mul = new multi2or3();
        System.out.print("3 ~ 33 사이, 2또는 3의 배수: ");
        mul.print2or3();

    }
}
