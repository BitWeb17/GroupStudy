import java.util.Scanner;

public class SecondJava {
    public static void main(String[] args) {
        int num1 = 5, num2 = 10;

        // &은 비트 연산자 AND를 의미함
        // 비트 연산의 특징 : 같은 자리수에 1이 배치된 경우에만 1이며
        // 그외의 케이스는 모두 0이다.
        // 집합으로 생각한다면 교집합
        int res = num1 & num2;
        System.out.println("num1 AND num2 =" + res);

        // |는 비트 연산자 OR를 의미함
        // OR 비트 연산의 특징 :
        // 같은 자리수에 하나라도 1이 배치되어 있다면 1이고
        // 그렇지 않다면 0이 된다.
        // 집합으로 보자면 합집합
        res = num1 | num2;
        System.out.println("num1 OR num2=" + res);

        // ^는 비트 연산자 XOR를 의미함
        // XOR 비트 연산의 특징
        // 서로 일치하는 것이 없는 경우에만 1이 된다.
        res = num1 ^ num2;
        System.out.println("num1 XOR num2=" + res);

        //~은 비트 연산자 NOT을 의미함.
        // NOT 비트 연산의 특징 :
        // 모든것을 부정한다.
        // 참의 부정 = 거짓
        // 거짓의 부정 = 참
        res = ~num1;
        System.out.println("NOT num1=" + res);

        Scanner scan = new Scanner(System.in);

        System.out.println("점수를 입력하세요:");
        int num = scan.nextInt();

        System.out.println("입력한점수는 " + num);


        // 주의점 : if-else if 사용시 히든 조건을 매우 조심해야한다.
        //          잘못 작성할 경우 프로그램 논리가 통채로 잘못될 가능성이 있고
        //          디버깅을 통해 오류를 잡는 것이 오래 걸릴 가능성이 높아진다.

        // 팁 : 가장 범주가 큰 녀석을 위로 올리고
        //      그것보다 작은 범주의 크기들을 서서히 단계단계 내리며 작성한다.
        // num<=100
        if (num > 100) { // num이 100보다 크다면
            System.out.println("잘못된 입력입니다.");
        } else if (num >= 90) { // num이 90이상이라면 && 100보다 작거나 같다면
            System.out.println("당신의 등급은 A입니다.");
        } else if (num >= 80) { // num이 80이상이라면 && 90보다 작다면
            System.out.println("당신의 등급은 B입니다.");
        } else if (num >= 70) { // num이 70이상이라면 && 80보다 작다면
            System.out.println("당신의 등급은 C입니다.");
        } else if (num >= 60) { // num이 60이상이라면 && 70보다 작다면
            System.out.println("당신의 등급은 D입니다.");
        } else { // 0보다 작다면
            System.out.println("잘못된 입력입니다.");
        }

        int finalRes = res;
        class IfTest {
            // psvm
            public void main(String[] args) {
                //sout
                System.out.println("안녕, 난 인텔리제이야~");

                String str1 = "짝수";
                String str2 = "홀수";

                Scanner scan = new Scanner(System.in);
                System.out.println("숫자를 입력하세요: ");
                //키보드 입력으로 받은 숫자를 num 변수에 대입
                int num = scan.nextInt();

                // 문자열과 숫자가 + 되면
                // 자동으로 숫자는 문자열이 되어서 처리된다.
                System.out.println("당신이 입력한 숫자는 =" + num);
                System.out.println("당신이 입력한 숫자는 =" + num + num); //ㅡ> 문자형식으로 출력
                // 실제로 숫자를 처리하고자 한다면
                // 연산의 순서를 아래와 같이 변경하여 작업하면 된다.
                System.out.println("당신이 입력한 숫자는 =" + (num + num));

                // 3항 연산자를 작성하는 방법
                //먼저 3항 연산자는 아래와 같은 형식으로 구성된다.
                // 조건 ? 참인경우 : 거짓인 경우

                // 아래 케이스의 경우엔 조건에 따라 결과값이 바뀌는데
                // 이 값을 res라는 변수에 대입한 것이다.

                System.out.println(num + "은" + Res + " 입니다!");
            }
        }
        class prefixSuffixOperation {
            public void main(String[] args) {
                int num = 3;

                // 전위 연산자는 해당 라인에서 실행된다.
                System.out.println("전위 연산자:" + (++num));
                System.out.println("전위 연산자:" + (++num));
                System.out.println("결과: " + num);

                num = 3;

                // 후위 연산자는 해당 라인 이후에 즉각 실행된다.
                System.out.println("후위 연산자:" + (num++));
                //즉각실행 자리
                System.out.println("후위 연산자:" + (num++));
                //즉각실행 자리
                System.out.println("결과: " + num);
            }
        }
        class LogicalOpearation {
            public void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                System.out.println("숫자를 입력하세요:");
                int num = scan.nextInt();

                // (num% 2 ==0) : 2로 나눈 나머지가 0인가?
                // (num % 2==0) : 3으로 나눈 나머지가 0인가?
                // &&논리 연산자 AND
                // 논리 연산자 AND는 두개의 조건이 모두 참인 경우에만 참이다.
                // 즉 위의 두 가지 질문에 대한 답이 모두 참이어여만
                // 아래의 if문이 동작하게 된다.
                if ((num % 2 == 0) && (num % 3 == 0)) {
                    System.out.println(num + "은 6의 배수다!");
                } else {
                    System.out.println(num + "은 6의 배수가 아니다!");
                }

                // || 논리 연산자 OR
                // 둘 중 하나라도 참이라면 참
                //
                if ((num % 2 == 0) || (num % 3 == 0)) {
                    System.out.println(num + "은 2 혹은 3의 배수다!");
                } else {
                    System.out.println(num + "은 2 혹은 3의 배수가 아니다!");
                }
                // ! 논리 연산자 NOT
                // 결과 자체를 부정한다.
                if (!(num % 2 == 0)) {
                    System.out.println(num + "은 2의 배수가 아니다!");
                } else {
                    System.out.println(num + "은 2의 배수다!");
                }
            }
        }

        class SecondProbTest {

            public void main(String[] args) {
                // TODO Auto-generated method stub
                // 변수란?
                // 1. 값을 받는 것
                // 엄밀한 정의 : 특정한 데이터타입을 저장할 수 있는 메모리 공간
                // 너프한 정의 : 특정한 데이터타입을 저장할 수 있는 공간

                // 입력받은 숫자가 2의 배수인지 판별해보자!
                // 아래보이는 Scanner scan =new Scanner(System.in)
                // 이 전체가 scan이라는 변수를 통해서
                // 키보드 입력을 받을 것임을 알려주는 것
                Scanner scan = new Scanner(System.in); // 준비 과정
                // new Scanner(System.in) 을 통해
                //이것이 실제 키보드에 대한 정보를 획득

                System.out.println("숫자를 입력하세요:");

                // 키보드 입력에 대한 처리는 아래 코드에서 수행
                // scan.nextInt() 실제 키보드 입력을 처리하는 부분

                //'=' 은~~과 같다가 아닌 대입 연산임을 명심하자!
                int num = scan.nextInt();

                System.out.println("입력 결과는 =" + num);

                // num % 2
                // % 연산자는 나머지를 구하는 연산자다.
                // num % 2는 'num을 2로 나눈 나머지를 구해주세요.'
                // 어떤 수를 2로 나눈 나머지는 0 혹은 1뿐이다.
                // 여기서 나머지가 0이란 뜻은 2로 나눠 떨어진다는 뜻이며
                // 2로 나눠 떨어진다면 이 값은 짝수임을 알 수 있다.
                // 나머지가 0이 아니라 1인 상황은 홀수 일 것이다.

                //'==' 은 앞에것과 뒤의것이 같은지 질문을 하는 것이다.
                // 질문에 답이 맞다면 true(1), 아니라면 false(0)
                // num을 2로 나눈 나머지가 0이 맞나요?
                // else는 if에 대한 조건이 맞지 않을 경우 사용한다.
                // else가 동작하는 시점은 if의 괄호에 있는 조건이
                // 거짓(false)가 되었을 경우에 동작하게 된다.

                if (num % 2 == 0) {
                    System.out.println("짝수입니다.");
                } else {
                    System.out.println("홀수입니다.");
                }

            }
        }


        class ShiftOpeartion {
            public void main(String[] args) {
                System.out.println("쉬프트 연산자 예제!");

                // final 이란 무엇인가 ? 값을 고정시키는 역할을 수행한다.
                // 그런데 왜 사용하는 것일까?
                // 매직 넘버
                // ex) 공장에는 생산라인이 5개 있다.
                // 사업을 따내서 생산라인이 8개가 되었음
                // 결국 유지보수를 편하게 하기위해 사용한다.
                // 이것은 결국 내가 야근을 하느냐 안하느냐로 귀결되고
                // 내가 집에 얼마나 빨리 갈 수 있는지로 귀결되기도 한다.
                final int SCALE_FACTOR1 = 2;
                final int SCALE_FACTOR2 = 3;
                final int SCALE_FACTOR3 = 1;
                int num = 10, num2 = 5;


                // 쉬프트 연산도 2진수와 연결이 된다
                // 숫자 10 - 0000 1010을 왼쪽 쉬프트로 2칸 이동한다.
                // 결과 40 - 0010 1000이 된다.
                // 2칸 올라올때 빈 공간은 0으로 채워지고
                // 넘치는 공간은 버린다.

                // 3칸 이동
                // 결과 80 - 0101 0000이 된다.
                // 쉬프트 한 칸당 2의  n승이 곱해지는 것을 볼 수 있다.
                System.out.println("10 << 2= " + (num << SCALE_FACTOR1));
                System.out.println("10 << 3= " + (num << SCALE_FACTOR2));
                System.out.println("5 >> 1= " + (num2 >> SCALE_FACTOR3));
                // 숫자 5 - 0000 0101 이며 오른쪽으로 1칸 이동한다.
                // 결과 2 - 0000 0010 이 된다.
                // 우리가 예상한 것은 2.5지만 실제로 2가 나왔다.
                // 이유는 쉬프트 연산이 정수에서만 가능하기 때문이다.
                // 주의점 : 곱셉은 2의 n을 곱하면 되지만
                //          나눗셈의 경우엔 나머지를 버리고 몫만 취한다.


                // 쉬프트에 의해 데이터가 사라지는 것을 확인 할 수 있는 예
                // 원래는 5<< 1과 같기 떄문에 10이 나와야 하지만
                // 데이터가 사라져서 8이 나오는 것을 목격할 수 있다.
                System.out.println("(5>>1) << 2 =" +
                        ((num2 >> SCALE_FACTOR3) << SCALE_FACTOR1));
            }
        }

        class SwitchCaseStatement {
            public void main(String[] args) {
                System.out.println("switch 문을 배워봅시다~");

                Scanner scan = new Scanner(System.in);

                System.out.println("점수를 입력하세요 : ");
                int num = scan.nextInt();

                if (num > 100 || (num < 0)) {
                    System.out.println("잘못된 값을 입력하였습니다.");
                }

                // (int) (num / 10.0f)
                // 위의 코드는 결과를 강제로 int 형으로 처리하는 방식이다.
                // 10.0f 라는 것이 보이는데
                // 실수형에 f가오면 float 타입을 의미한다.
                // 결국 f를 쓰지 않으면 double 타입을 의미한다.
                // 위의 방식을 강제 캐스팅이라고도 하며 Type Casting이라 부른다.
                int fnum = (int) (num / 10.0f);
                System.out.println("실수형을 정수형으로 만든 값 = " + fnum);

                // 90~100 : A, 80~89 : B, 70~79 : C, 60~69 : D, 나머지 F
                // 90~100 / 10 = 9.0~10.0
                // 80~89 / 10 = 8.0~8.9
                // 70~79 / 10 = 7.0~7.9
                // 60~69 / 10 = 6.0~6.9
                // 0~59 / 10 / 0.0~5.9

                //break가 case마다 있는 것을 볼 수 있다.
                //break가 없는 경우
                //아래와 같이 10과 9인 경우
                //10 혹은 9에 대해 모두 같은 처리를 하겠음을 의미한다.
                //break를 만나기 전까지는 동작이 유지된다.
                switch (fnum) {
                    case 10:
                    case 9:
                        System.out.println("당신의 등급은 A");
                        break;
                    case 8:
                        System.out.println("당신의 등급은 B");
                        break;
                    case 7:
                        System.out.println("당신의 등급은 C");
                        break;
                    case 6:
                        System.out.println("당신의 등급은 D");
                        break;
                    case 5:
                        System.out.println("당신의 등급은 F");
                        break;
                    // default는 ㅡ> case 각각의 케이스들을 적는다고 하였는데
                    // 해당하는 케이스가 하나도 없을 경우
                    default:
                        System.out.println("당신은 F 빵야빵야");
                        break;

                }
            }
        }
    }
}