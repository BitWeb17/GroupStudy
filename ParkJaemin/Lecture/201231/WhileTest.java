public class WhileTest {
    public static void main(String[] args) {
        // 1~10까지 출력해보기 ~
        int num = 1;

        // while 문을 작성하는 방법
        // 1. while을 적고 괄호를 열고 닫고 중괄호를 열고 닫는다.
        // 2. 괄호  안에 조건을 작성한다.
        //    (조건이 만족하는 동안 반복)
        // 3. 반복시킬 내용을 중괄호 내부에 작성한다.

        // num < 11이 조건이 되었으며
        // Phase 1) 현재 num값이 1이므로 조건은 참이 된다.
        // phase 2) 다시 위의 조건을 검사하고 num은 2이므로 참이다.
        // ......
        // phase 10) 현재 num은 10일 것임
        // phase 11) 현재 num이 11이므로 조건이 거짓이 된다.
        while (num < 11) {
            // phase 1) 현재 num값을 뿌리고 num 값을 1증가시킨다.
            // phase 2) 현재 num값을 뿌리고 num 값을 1증가
            // ......
            // Phase 10) 현재 num값을 뿌리고 num 값을 1증가
            System.out.println("num = " + num++);
        }
        System.out.println("마지막 num = " + num);

        int res = 2;

        while (res < 20) {
            System.out.println("res =" + res++);
        }
        System.out.println("마지막 num = " + res);

        }
    }

