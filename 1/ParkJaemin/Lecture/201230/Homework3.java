import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");

        int num = scan.nextInt();
        // 입력값은 1000~2000, 정지 1500, 1470~1500정지 1501~1529 정지
        if(num>2000) { // num이 2000보다 크다면
            System.out.println("잘못된 값 입력");
        }else if(num>=1530) { // num이 1530이상이라면 && 2000보다 작거나 같다면
            System.out.println("전진");
        } else if (num > 1470) { // num이 1470크다면 && 1530보다 작다면
            System.out.println("정지");
        } else if (num>999) { // num이 999보다 크다면 && 1470보다 작다면
            System.out.println("후진");
        }  else { // 999보다 작거나 같다면
            System.out.println("잘못된 입력입니다.");


        }
    }
}

//------------------------------------------------------