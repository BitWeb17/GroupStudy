public class Ex06 {
    public static void main(String[] args) {
        int[] array = new int[100]; // 1 ~ 100까지 넣을 빈 배열을 만들기
        int[] three_multi = new int[33]; // 3의 배수을 넣을 빈 배열 만들기
        int count = 0; // array[i]에서 3의 배수를 찾은 갯

        for(int i = 0; i < array.length; i++) { // 빈 배열에 1 ~ 100 저장하기
            array[i] = i + 1; // array[0] = 1, array[1] = 2, array[2] = 3 ...array[99] = 100
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }


        for(int i = 0; i < array.length; i++) { // 3의 배수만 저장하
            if(array[i] % 3 == 0) { // array[2] = 3, array[5] = 6, array[8] = 9 ...array[98] = 99
                three_multi[count] = array[i]; // 새로운 배열에 하나씩 넣는다.
                count++; // 3의 배수를 찾을때 마다 count++
            }
        }

        for(int j = 0; j < count; j++) { // 3의 배수를 찾은 갯수 j = 0 ~ count까지
            System.out.printf("three_multi[%d] = %d 3의 배수!\n",j ,three_multi[j]);
            // three_multi[0] = 3, three_multi[1] = 6, three_multi[2] = 9...three_multi[32] = 99
        }
    }
}