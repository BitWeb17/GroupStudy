class C extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            BankTest.sb.plusMoney(3000);
        }
        System.out.println("plusMOney(3000): " + BankTest.sb.getMoney());
    }
}

class D extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            BankTest.sb.minusMoney(1000);
        }
        System.out.println("plusMOney(3000): " + BankTest.sb.getMoney());
    }
}

public class BankTest {

    public static SynchronizedBank sb = new SynchronizedBank();

    public static void main(String[] args) {

        System.out.println(sb.getMoney());
        C c = new C();
        D d = new D();

        c.start();
        d.start();

        // 이 문제를 해결하기 위해 Mutex, Spinlock이 필요함
    }
}