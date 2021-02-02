import java.io.IOException;

// 서버의 Main 클래스 : 서버를 구동함
    // 서버의 역할 : 클라이언트들의 데이터를 관리하고 연결을 중개함
public class MainServer {
    // 서버의 서비스 번호 (포트 번호)
    private static final int PORTNUM = 7777;
    // 접속을 허용하는 클라이언트 수
    private static final int MAX = 3;

    // 입출력 예외처리 (throws IOException) : 입출력 명령어 사용시 필수
    //      없으면 컴파일 에러 발생 (print(), println(), prinf() 에는 자체적으로 있어 제외)
    public static void main(String[] args) throws IOException {
        // 서버 소켓 메모리 할당
        ServerSocketManager ssm = new ServerSocketManager(PORTNUM, MAX);
    }
}