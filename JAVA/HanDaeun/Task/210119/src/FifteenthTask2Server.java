import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FifteenthTask2Server {
    public static void main(String[] args) {
        Socket clntSock;
        OutputStream out;
        PrintWriter writer;
        InputStream in;
        BufferedReader reader;

        int port = 33333;
        String receivedMsg;
        String sendMsg;

        try {
            System.out.println("***** 플레이어들을 기다리는 중입니다 *****\n");

            ServerSocket servSock = new ServerSocket(port);
            Scanner scan = new Scanner(System.in);
            HashMap<String, Object> clntSockMap = new HashMap<>();

            RockPaperScissors rps = new RockPaperScissors();


            while(true) {
                clntSock = servSock.accept();
                out = clntSock.getOutputStream();
                writer = new PrintWriter(out, true);
                in = clntSock.getInputStream();
                reader = new BufferedReader(new InputStreamReader(in));

                System.out.println("[" + clntSock.getInetAddress() + "] Player 가 입장하셨습니다.");
                sendMsg = "주사위 게임에 접속되었습니다. 닉네임을 입력해주세요 : ";
                writer.print(sendMsg);
                receivedMsg = reader.readLine();
                clntSockMap.put(receivedMsg, clntSock);

                sendMsg = "주사위 게임에 접속되었습니다.";
                writer.println(sendMsg);

                /*
                // 새로운 게임을 세팅
                sendMsg = "";
                writer.println(sendMsg);
                System.out.println(sendMsg);
                rps.setRpsInput();
                sendMsg = rps.getMsg();

                // Player 1(Server) 의 입력을 받음
                System.out.println(sendMsg);
                rps.setP2Wait();
                sendMsg = rps.getMsg();
                writer.println(sendMsg);

                // Player 2(Client) 의 입력을 받음
                rps.setRpsInput();
                sendMsg = rps.getMsg();
                writer.println(sendMsg);
                System.out.println(rps.getP1WAIT());
                receivedMsg = reader.readLine();

                // 플레이어들이 입력한 것을 양쪽에 모두 출력해줌
                System.out.println("Player 1: " + rpsInput);
                System.out.println("Player 2: " + receivedMsg);
                writer.println("Player 1: " + rpsInput);
                writer.println("Player 2: " + receivedMsg);

                // 게임의 결과를 양쪽에 모두 출력해줌
                rps.rpsPlay(rpsInput, receivedMsg);
                sendMsg = rps.getMsg();
                System.out.println(sendMsg);
                writer.println(sendMsg);
                */
            }

        } catch (IOException e) {
            System.out.println("Server Exception: " + e.getMessage());

            e.printStackTrace();
        }
    }
}
