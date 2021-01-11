package Ninth;

public class MyDice {
    int playerNum;
    int numOfDice;
    int[] sumOfDice;
    int ruleNum;
    int[] playerArr;


    public MyDice(int playerNum, int numOfDice,int ruleNum){
        this.playerNum = playerNum;
        this.numOfDice = numOfDice;
        this.ruleNum = ruleNum;

        // playerNum : 사용자 숫자를 받기 위한 변수
        // numOfDice : 주사위 숫자
        // ruleNum :  6이 나오면 0으로 만들기 위한 특수 규칙이 적용되는 수

        playerArr = new int[playerNum];
        sumOfDice = new int[playerNum];
        // 정렬을 하다 보니깐 주사위 합산 배열 정렬할 때
        // 사용자도 같이 이동시켜줘야 하므로 사용자 배열도 같이 정렬


        for(int i = 0;i <this.playerNum;i++){
            sumOfDice[i]= 0;
            playerArr[i] = i;
        }
    }


    public void playGame(){
        for (int i = 0;i<playerNum;i++){
            for (int j=0;j<numOfDice;j++){
               int dice = (int) (Math.random()*6)+1;
               if(dice ==ruleNum){
                   continue;
               }

               sumOfDice[i] += dice;
            }
        }
    }
    public  void  printSumOfDice(){
        for(int i =0;i<playerNum;i++){
            System.out.printf( "%d 번째 사용자의 주사위 눈금합 = %d\n",
                    playerArr[i],sumOfDice[i]);

        }
    }

    // 오직 개수가 적은것에만 유리한 정렬 알고리즘(삽입정렬)

    public void insertSort(){
        int i,j,numkey, playweNoKey, len = sumOfDice.length;

        //numKey 값은 교체 대상의 백업
        // playerNoKey 도 마찬가

        // 현재 케이스에서는 숫자만 정렬하면 안되고
        // 사용자 번호를 같이 처리(핸들링)해줘야 한다.지

        // 1    2    3        - 사용자 번호
        // 8    4    6        - 주사위 눈금
        //[0]  [1]  [2]       - 배열의 인덱스

        for (i= 1;i<len;i++) {
            numkey = sumOfDice[i];
            playweNoKey = playerArr[i];

            // (j != -1) 은 sumOfDice[-1]에 의해 배열 인덱스 오류를 방지하기 위해 도입
            for (j = i - 1; (j != -1) && sumOfDice[j] > numkey; j--) {
                sumOfDice[j + 1] = sumOfDice[j];
                playerArr[j + 1] = playerArr[j];
            }
            // 1    1    3        - 사용자 번호
            // 8    8    6        - 주사위 눈금
            //[0]  [1]  [2]       - 배열의 인덱스

/*
            if (j == 0) {
                break;
            }*/


            // 원래는 -1 + 1이어야 하는 것이
            // 0 + 1 되므로 +1을 지웠으나
            // 일반적으로 j를 그냥 받아 j = i- 1을 하므로
            // 아래 코드들이 영향을 받아 모두 이상해진다.
             sumOfDice[j+1] =numkey;
             playerArr[j+1]=playweNoKey;
            // sumOfDice[j] =numkey;
            // playerArr[j]=playweNoKey;
        }



    }






}
