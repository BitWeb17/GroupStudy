import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 서버 소켓 사용에 필요한 데이터 및 매서드들이 있는 클래스
// SocketManager 클래스를 상속받음
public class ServerSocketManager extends SocketManager {
    private ServerSocket servSock;      // 서버 소켓
    private Socket[] clntSockArr;       // 클라이언트 소켓 배열
    private int clntCnt;                // 접속 허용한 클라이언트 소켓 수
    private int clntMax;                // 접속 허용할 최대 클라이언트 소켓 수

    // 생성자
    public ServerSocketManager(int portNum, int max) throws IOException {
        // 넘겨받은 포트 번호(portNum) 으로 서버 소켓 할당
        servSock = new ServerSocket(portNum);

        System.out.printf("%d 명이 접속해야 게임을 시작할 수 있습니다.\n", max);

        clntSockArr = new Socket[max];
        clntCnt = 0;
        clntMax = max;
        super(max);
    }
}
