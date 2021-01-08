public class Ex02 {
    public static void main(String[] args) {
        // 1번 문제에서 만든 배열에 랜덤 값을 할당해보자!

        int[] num = new int[7];

        for(int i = 0; i < num.length; i++) {
            int random = (int)(Math.random() * 10);
            num[i] = random;
            System.out.printf("arr[%d] = %d\n",i ,num[i]);
        }
    }
}
