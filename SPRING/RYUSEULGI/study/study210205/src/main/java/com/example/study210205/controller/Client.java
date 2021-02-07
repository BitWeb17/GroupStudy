package com.example.study210205.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    final static int SERVPORT = 7777;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        // InetAddress 객체 반환
        InetAddress ip = InetAddress.getByName("localhost");

        // 서버에 접속한다고 요청
        Socket sock = new Socket(ip, SERVPORT);

        DataInputStream in = new DataInputStream(sock.getInputStream());
        DataOutputStream out = new DataOutputStream(sock.getOutputStream());

        // 메시지 보내기
        Thread send = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {
                    String msg = scan.nextLine();
                    try {
                        out.writeUTF(msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // 메시지 받기
        Thread recv = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {
                    try {
                        String msg = in.readUTF();
                        System.out.println("상대방 : " + msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // 스레드이기 때문에 시작을 해주어야 작동
        send.start();
        recv.start();

        sock.close();
        scan.close();
    }
}
