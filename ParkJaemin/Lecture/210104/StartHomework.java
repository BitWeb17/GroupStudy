import java.util.Scanner;

public class StartHomework {
    public static void main(String[] args) {

        //시작 값을 입력 받도록 하고
        //끝나는 값을 입력 받도록 만들어서 시작 ~ 끝까지의 합을 출력해보자!
        Scanner scanner = new Scanner(System.in);
        System.out.println("시작하는 값은 = ");


        int num = scanner.nextInt();
        // int start = scan.NextInt();

        System.out.println("끝나는 값은 = ");
        int num2 = scanner.nextInt();
// int start2 = scan.NextInt();


        int sum = 0;
        for (int i = num; i <= num2; i++) {
            sum = sum + i;


        }
        System.out.println("시작하는 값과 끝나는 값의 총합 = " + (sum));
//        System.out.printf("%d ~%d까지의 합 = %d\n, " start,end,sum);


    }
}
