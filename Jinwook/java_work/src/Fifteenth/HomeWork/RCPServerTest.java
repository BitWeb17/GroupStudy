package Fifteenth.HomeWork;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;



public class RCPServerTest {

    public static void main(String[] args) {
        Scanner servScan;
        Scanner clintScan;
        int servRCP;
        int clintRCP;
        final int SCISSORS = 1;
        final int ROCK = 2;
        final int PAPER = 3;


        int port = Integer.parseInt("22222");
        servScan = new Scanner(System.in);



        try {

            ServerSocket servSock = new ServerSocket(port);

            System.out.println("Server: Listening - " + port);

            while(true) {


                Socket clintsock = servSock.accept();

                System.out.println(
                        "[" + clintsock.getInetAddress() +
                                "] client connected"
                );
                System.out.print("1번 가위 , 2번 주먹, 3번 보자기 선택하세요 : ");
                servRCP = servScan.nextInt();
                clintRCP = ??????; //이부분 해결하지 못했습니다.

                if (servRCP == clintRCP) {
                    System.out.println("Draw");
                } else if(servRCP == SCISSORS && clintRCP == PAPER) {
                    System.out.println("Win");
                    break;
                } else if(servRCP == ROCK && clintRCP == SCISSORS) {
                    System.out.println("Win");
                    break;
                } else if(servRCP == PAPER && clintRCP == ROCK) {
                    System.out.println("Win");
                    break;
                } else {
                    System.out.println("Lose");
                    break;
                }



                OutputStream out = clintsock.getOutputStream();

                PrintWriter writer = new PrintWriter(out, true);



                writer.println(servRCP);



                InputStream in = clintsock.getInputStream();


                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));



                System.out.println("상대방: " + reader.read());
            }
        } catch (IOException e) {



            System.out.println("Server Exception: " + e.getMessage());


            e.printStackTrace();
        }
    }
}