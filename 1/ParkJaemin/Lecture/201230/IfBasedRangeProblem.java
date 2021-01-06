import java.util.Scanner;

public class IfBasedRangeProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("점수를 입력하세요:");
        int num = scan.nextInt();

        System.out.println("입력한점수는 " + num);


        // 주의점 : if-else if 사용시 히든 조건을 매우 조심해야한다.
        //          잘못 작성할 경우 프로그램 논리가 통채로 잘못될 가능성이 있고
        //          디버깅을 통해 오류를 잡는 것이 오래 걸릴 가능성이 높아진다.

        // 팁 : 가장 범주가 큰 녀석을 위로 올리고
        //      그것보다 작은 범주의 크기들을 서서히 단계단계 내리며 작성한다.
        // num<=100
        if(num>100) { // num이 100보다 크다면
            System.out.println("잘못된 입력입니다.");
        }else if(num>=90) { // num이 90이상이라면 && 100보다 작거나 같다면
            System.out.println("당신의 등급은 A입니다.");
        } else if (num >= 80) { // num이 80이상이라면 && 90보다 작다면
            System.out.println("당신의 등급은 B입니다.");
        } else if (num>=70) { // num이 70이상이라면 && 80보다 작다면
            System.out.println("당신의 등급은 C입니다.");
        } else if (num>=60) { // num이 60이상이라면 && 70보다 작다면
            System.out.println("당신의 등급은 D입니다.");
        } else { // 0보다 작다면
            System.out.println("잘못된 입력입니다.");
        }
        }
    }

