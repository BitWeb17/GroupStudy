import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class FifteenthTask1Client {
    public static void main(String[] args) {
        String hostname;
        int port;
        String sendMsg, receivedMsg;
        Scanner scan = new Scanner(System.in);

        System.out.print("접속하려는 서버의 IP 주소 : ");
        hostname = scan.nextLine();

        System.out.print("사용하려는 서비스의 포트 번호 : ");
        port = Integer.parseInt(scan.nextLine());


        try {
            Socket sock = new Socket(hostname, port);

            OutputStream out = sock.getOutputStream();
            PrintWriter writer = new PrintWriter(out, true);

            InputStream in = sock.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            RockPaperScissors rps = new RockPaperScissors();


            while(true) {
                receivedMsg = reader.readLine();
                System.out.println(receivedMsg);

                if(receivedMsg.equals(rps.getSTART())) {
                    sendMsg = scan.nextLine();
                    writer.println(sendMsg);
                }
            }

        } catch (UnknownHostException e) {
                System.out.println("Server Not Found: " + e.getMessage());

        } catch (IOException e) {
                System.out.println("I/O Error: " + e.getMessage());
        }
    }
}