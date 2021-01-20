import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FifteenthTask1Server {
    public static void main(String[] args) {
        int port = Integer.parseInt("33333");
        String[] receivedMsg = new String[2];
        String sendMsg;

        try {
            ServerSocket servSock = new ServerSocket(port);
            Socket clntSock = servSock.accept();

            OutputStream out = clntSock.getOutputStream();
            PrintWriter writer = new PrintWriter(out, true);

            InputStream in = clntSock.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            RockPaperScissors rps = new RockPaperScissors();

            System.out.println("[" + clntSock.getInetAddress() + "] 플레이어 입장하셨습니다.");


            while(true) {
                sendMsg = "";
                writer.println(sendMsg);
                System.out.println(sendMsg);

                rps.setRpsStart();
                sendMsg = rps.getMsg();

                System.out.println(sendMsg);
                writer.println(sendMsg);
                receivedMsg[0] = reader.readLine();
                System.out.println("Player 1: " + receivedMsg[0]);

                System.out.println(sendMsg);
                writer.println(sendMsg);
                receivedMsg[1] = reader.readLine();
                System.out.println("Player 2: " + receivedMsg[1]);

                rps.rpsPlay(receivedMsg[0], receivedMsg[1]);
                sendMsg = rps.getMsg();
                System.out.println(sendMsg);
                writer.println(sendMsg);
            }

        } catch (IOException e) {
            System.out.println("Server Exception: " + e.getMessage());

            e.printStackTrace();
        }
    }
}