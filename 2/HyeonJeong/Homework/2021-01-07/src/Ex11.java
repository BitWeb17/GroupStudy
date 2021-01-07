class CheckEven {

    int[] array;
    int randnum;
    int count;

    public void setCheckEven() {
        randnum = (int)(Math.random() * 30) + 1;
        array = new int[randnum];
        System.out.printf("array = new int[%d]\n",randnum);
        for(int i = 1; i < randnum; i++) {
            if(i % 2 == 0) {
                count++;
                System.out.print(i+", ");
            }
        }
        System.out.printf("\n이 배열에 짝수는 %d개", count);

    }
}

public class Ex11 {
    public static void main(String[] args) {
        CheckEven ce = new CheckEven();
        ce.setCheckEven();
    }
}
