package com.example.study210205.controller;

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
    boolean isOK;

    Scanner scan = new Scanner(System.in);

    public ClientHandler(DataInputStream in, DataOutputStream out, String name, Socket sock) {
        this.in = in;
        this.out = out;
        this.name = name;
        this.sock = sock;
        this.isOK = true;
    }

    @Override
    public void run() {
        String received;

        for (;;) {
            try {
                // 메시지 받기
                received = in.readUTF();
                System.out.println(received);

                // 받은 메시지가 Q와 같다면 종료
                if (received.equals("Q")) {
                    this.isOK = false;
                    this.sock.close();
                    break;
                }

                // #으로 문자열 분리
                StringTokenizer st = new StringTokenizer(received, "#");
                String recipient = st.nextToken();
                String msg2Send = st.nextToken();
                System.out.println("보내는 메시지" + msg2Send);
                System.out.println("받은 메시지" + recipient);

                for (ClientHandler ch : Server.clntHandle) {
                    // 메시지 보낼 때 조건
                    if (ch.name.equals(recipient) && ch.isOK == true) {
                        ch.out.writeUTF(this.name + " : " + msg2Send);
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // 종료
            try {
                this.in.close();
                this.out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
