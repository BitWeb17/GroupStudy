public class Ex06 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int[] three_multi = new int[33];
        int roomnumber = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }


        for(int i = 0; i < array.length; i++) {
            if(array[i] % 3 == 0) {
                three_multi[roomnumber] = array[i];
                roomnumber++;
            }
        }

        for(int j = 0; j < roomnumber; j++) {
            System.out.printf("array[%d] = %d 3의 배수!\n",j,three_multi[j]);
        }
    }
}
