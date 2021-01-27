package Twentyoneth;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ThreadChatServer {
    static Vector<ClientHandler> chv = new Vector<>();

    static int i = 0;

    public static void main(String[] args) throws IOException {
        ServerSocket servSock = new ServerSocket(7777);
        // 서버의 서비스(7777)를 시작
        Socket sock;

        for(;;) { //서버를 열어 클라이언트가 접속하면
            System.out.println("지금부터 클라이언트의 입장을 대기합니다.");
            sock = servSock.accept();

            System.out.println("새로운 클라이언트가 입장: " + sock);

            // 송신 및 수신 채널 할당
            DataInputStream in = new DataInputStream(sock.getInputStream());
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());

            System.out.println("클라이언트의 요청을 처리하기 위한 핸들러!");

            // 클라이언트용 핸들러 작성 필요 할당
            // 서버와 클라이언트 요청에 대한 응답 처리(클라이언트 정보 - 송수신채널 / 소켓 정보 )
            ClientHandler ch = new ClientHandler(in, out, "client" + i, sock);

            Thread t = new Thread(ch);

            System.out.println("클라이언트 리스트 관리!");

            chv.add(ch); // chv에 저장

            t.start();

            i++;
        }
    }
}