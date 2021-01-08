public class Ex04 {
    public static void main(String[] args) {
        //float 형 배열에 랜덤 값 3개를 입력해보자!

        float[] array = new float[3];

        for(int i = 0; i < array.length; i++) {
            float random = (float)(Math.random());
            array[i] = random;
            System.out.printf("array[%d] = %f\n",i, array[i]);
        }
    }
}
