import java.util.*;

class Fibonacci {

    int res = 0;
    int first = 1, second = 1;

    public void printNth(int nth) {
        System.out.print(first+", ");
        System.out.print(second+", ");

        for(int i = 0; i < nth-2; i++) {
            res = first + second;
            System.out.print(res+", ");
            first = second;
            second = res;
        }
    }
}

public class Ex06 {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.printNth(20);
    }
}
