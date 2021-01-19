public class ContinueTest {
    public static void main(String[] args) {
        final int MAX = 11;
        int i = 1;

        while (i<MAX) {
            i++; // 독립해서 작성하는 이유(질문물어보기) - 프린트ln에 출력안하고

            // q : 4가 왜 빠지나요?
            // a : continue 하는 시점이 5
            //      continue 하면 다시 while로(루프) 올라간다.
            //      다시올라가서 ++하므로 6

            if(i==5){
                System.out.println("걸렸다!");
                // continue를 수행하면
                // 현재 진행하던 작업을 멈추고 다시
                // 루프(반복)의 최상위로 이동한다 - while로 이동
                continue;
            }
            System.out.println("i = " + (i-1));
        }
        System.out.println("이건 어디서나 동작하는 녀석");
    }
}
