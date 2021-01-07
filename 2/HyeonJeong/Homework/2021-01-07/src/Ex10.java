class RandomArray {

    int[] array;
    int randnum;

    public void setArray() {
        randnum = (int)(Math.random() * 30) + 1;
        array = new int[randnum];
        System.out.printf("array = new int[%d]\n",randnum);
    }
}

public class Ex10 {
    public static void main(String[] args) {
        RandomArray ra = new RandomArray();
        ra.setArray();

    }
}
