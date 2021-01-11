// 구구단을 클래스를 활용해서 프로그래밍 해보자!

class Test{
    
    int number;

    public Test(int number){
        this.number = number;
    } 

    public void makeGoogoo(){
        for (int i = 1; i <= 9; i++){
            System.out.println(number + "x" + i + "=" + (number * i));
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        Test test = new Test(4);
        test.makeGoogoo();
    }
}
