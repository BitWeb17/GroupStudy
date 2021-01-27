package Twentieth;

public class AccelThread extends OperationAccelerator implements Runnable {
    private int localStart;
    private int localEnd;
    private int threadId;
    private double result;
    final  double COEFFICIENT = Math.pow(10, -15);
    final  double DEG2RAD = 180.0;

    public AccelThread(int start, int end, int maxThreadNum, int id) {
        super(start, end, maxThreadNum);

        int total = end - start + 1;
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