public class Quiz7 {
    public static void main(String[] args) {
        final int TARGET = 11;
        int i = 1;

        while (i<TARGET) {
            System.out.println("i = " + i++);
            if(i==7){
                i++;
                break;
            }

        }
    }
}
