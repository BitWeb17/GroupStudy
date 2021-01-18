import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");

        int num = scan.nextInt();

        System.out.println("입력 결과는 = " + num);

        // num을 5로 나눠서 나머지가 1인가?
        if(num % 5 == 1) {
            System.out.println(num + "은 5로 나눠서 1이 남는다");
        } else{
            System.out.println(num + "은 5로 나눠서 1이 남지 않는다");
        }
    }
}
