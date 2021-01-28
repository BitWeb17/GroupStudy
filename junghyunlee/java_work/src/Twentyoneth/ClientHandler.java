package Twentyoneth;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ClientHandler implements Runnable {
    final DataInputStream in;
    final DataOutputStream out;

    private String name;

    Socket sock;
    // isOK 참 또는 거짓
    boolean isOK;

    Scanner scan = new Scanner(System.in);

    public ClientHandler(DataInputStream in, DataOutputStream out,
                         String name, Socket sock) {

        this.in = in;
        this.out = out;
        this.name = name;
        this.sock = sock;

        this.isOK = true;
    }

    @Override
    public void run() {
        String received;

        for(;;) {
            try {
                // in.readUTF 을 할당
                received = in.readUTF();

                // received 출력
                System.out.println(received);

                // 객체끼리 내용을 비교할 수 있도록 한다.
                // receiced 와 q 의 값이 같은가
                if(received.equals("q")) {
                    this.isOK = false;
                    this.sock.close();
                    break;
                }

                // StringTokenizer는 특수한 기준자를 바탕으로 문자열을 분리한다.
                StringTokenizer st = new StringTokenizer(received, "#");
                // 토큰 단위로 할당한다.
                String recipient = st.nextToken();
                String msg2Send = st.nextToken();
                System.out.println("msg2Send = " + msg2Send);
                System.out.println("recipient = " + recipient);


                for(ClientHandler ch : ThreadChatServer.chv) {
                    // name 과 recipient 값이 같으면서 &&& isOK 참일때 시작
                    if(ch.name.equals(recipient) && ch.isOK == true) {
                        ch.out.writeUTF(this.name + ": " + msg2Send);
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            this.in.close();
            this.out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
