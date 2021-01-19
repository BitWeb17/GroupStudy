package Fifteenth.HomeWork;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class RCPClientTest {
    public static void main(String[] args) {
        Scanner servScan;
        Scanner clintScan;
        int servRCP ;
        int clintRCP;
        final int SCISSORS = 1;
        final int ROCK = 2;
        final int PAPER = 3;
        clintScan  = new Scanner(System.in);

        String hostname = "127.0.0.1";



        int port = 22222;
        for(int i = 0 ; i < 10; i++){
            try {


                Socket sock = new Socket(hostname,port);

                System.out.print("1번 가위 , 2번 주먹, 3번 보자기 선택하세요 : ");
                clintRCP = clintScan.nextInt();
                servRCP = ??????; ///이부분 해결을 못했습니다.

                if (clintRCP == servRCP) {
                    System.out.println("Draw");
                } else if(clintRCP == SCISSORS && servRCP == PAPER) {
                    System.out.println("Win");
                    break;
                } else if(clintRCP == ROCK && servRCP == SCISSORS) {
                    System.out.println("Win");
                    break;
                } else if(clintRCP == PAPER && servRCP == ROCK) {
                    System.out.println("Win");
                    break;
                } else {
                    System.out.println("Lose");
                }


                OutputStream out = sock.getOutputStream();

                int clintInt = clintRCP;

                out.write(clintInt);


                InputStream in = sock.getInputStream();
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));


                int rcp = reader.read();
                System.out.println("상대방: " + rcp); //이부분이 이상하게 나옵니다.


            }catch (UnknownHostException e){
                System.out.println("Server Not Found" + e.getMessage());
            }catch (IOException e){
                System.out.println("I/O Error"+ e.getMessage());
            }
        }
    }
}
