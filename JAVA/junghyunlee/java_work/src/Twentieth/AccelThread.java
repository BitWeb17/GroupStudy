package Twentieth;

public class AccelThread extends OperationAccelerator implements Runnable {
    private int localStart;
    private int localEnd;
    private int threadId;

    public AccelThread(int start, int end, int maxThreadNum, int id) {
        // 상속받은 OperationAccelerator 의
        // public OperationAccelerator(int start, int end, int maxThreadNum)
        // 가져온다.
        super(start, end, maxThreadNum);

        int total = end - start + 1;
        // 스레드에 정확히 나눠서 배분하기 위해서.
        // 예를들면 10000개의 데이터가 있다고 가정하자.
        // 그러면 스레드가 10개라면 1000개씩 검사할 것이다.
        // 그런데 만약에 10001개라면? 10개라면 1000개씩
        // 하고 나머지 한개를 누가 가져갈것인가????
        // 그러면 데이터가 삭제가 되거나 무시가 되면 데이터
        // 무결성원칙이 깨지기 때문에 아닐것 같으니
        // 랜덤으로 1개가 분배될 듯 하다.
        int threadPerData = total / maxThreadNum;

        localStart = id * threadPerData + 1;
        localEnd = localStart + threadPerData - 1;
        threadId = id;
    }

    @Override
    public void run() {
        System.out.printf("threadId = %d, localStart = %d\n", threadId, localStart);
        System.out.printf("threadId = %d, localEnd = %d\n", threadId, localEnd);
    }
}