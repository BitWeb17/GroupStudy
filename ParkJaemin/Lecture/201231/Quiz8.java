public class Quiz8 {
    public static void main(String[] args) {
        final int MAX = 11;
        int i = 1;

        while (i<MAX) {
            i++;
            if(i==8){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
