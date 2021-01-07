package SeventhHomeWork;
class fibonacciWork{
    int first = 1;
    int second= 0;
    int res;

    public void setRes(int res) {
        //res = first + second;
        this.res = res;
    }

    public void setFirst(int first) {
        //first = second;
        this.first = first;
    }

    public void setSecond(int second) {
       // second = res;
        this.second = second;
    }

    public void third(){
        for(int i= 1;i<20;i++){
            res =first +second;
            first =second;
            second =res;
            System.out.println("값은:" + res);
        }


    }
}

public class Homework6 {
    public static void main(String[] args) {
        System.out.printf("6) 피보나치 수열을 배열 없이 만들어서 출력해보도록 만들자!\n");

        fibonacciWork FIBO = new fibonacciWork();
        FIBO.third();

    }
}
