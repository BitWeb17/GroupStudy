package Nineteenth;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ItemEnhaceThreadTest {
    private Semaphore sem = new Semaphore(3); // 세마포어 3개 ㅡ> 쓰레드가 3개까지 진입

    public void enter(Item item){
        try {
            sem.acquire();
        }catch (InterruptedException e){
            return;
        }
        try {
            item.enhance(this);
        }finally {
            sem.release(); // 하나의 쓰레드를 내보내면 다른게 진입하여 실행(1번아이템)
        }

    }
    public static class Item{
        private static int cnt = 0;
        private int num =++cnt;

        private void enhance(ItemEnhaceThreadTest iet){
            System.out.println("강화 시작!");

            Random rand = new Random();

            try{
                Thread.sleep(rand.nextInt(5000)+ 5000);
            }catch (InterruptedException e){

            }
            System.out.println(num + "번 아이템 강화 종료!");
        }
    }
    // Mutex는 Thread 1개만 활용할 수 있는 Lock이라 보면 되겠다.

    // *Mutex
    // --------------
    // | lock = 1 | 특정한 메모리 주소공간(SL)
    // --------------

    // SL에 값이 1이냐? 아니냐?
    // 1이면 현재 Lock상태니깐 들어오지마!
    // 0이면 현재 Unlock상태니깐 먼저 들어오는 놈이 임자

    // *semaphore
    // --------------
    // | lock = 1 | 특정한 메모리 주소공간(SL1)
    // --------------
    // --------------
    // | lock = 2 | 특정한 메모리 주소공간(SL2)
    // --------------
    // --------------
    // | lock = 3 | 특정한 메모리 주소공간(SL3)
    // --------------

    // SL에 값이 1,2,3 중 빈게이냐? 없냐?
    // 있으면 먼저 들어오는놈이 임
    // 없으면 모두 있으니깐 돌아가렴


    //synchronized 같은 경우에는 Mutex개념으로
    //Thread 여러개가 동시다발적으로 구동이 불가능한 반면
    //semaphore는 Mutex List 같은 개념으로
    //Thread 여러개가 동시다발적으로 구동이 가능하다.

    //Mutex와 Semaphore의 차이점은 무엇인가?
    //대기열이 있다 없다의 차이다.
    public static void main(String[] args) {
        final ItemEnhaceThreadTest iet = new ItemEnhaceThreadTest();

        for(int i =0; i<6; i++){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    Item item = new Item();
                    iet.enter(item);
                }
            });
            t.start();
        }
    }
}
