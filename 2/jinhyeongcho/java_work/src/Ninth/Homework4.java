package Ninth;

public class Homework4 {
    public static void main(String[] args) {
        MyDice md = new MyDice(5,3,6);
        md.playGame();
        md.printSumOfDice();

        md.insertSort();
        md.printSumOfDice();
    }
}
