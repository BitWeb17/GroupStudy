package com.example.study210205.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {

    // sycronized용 arraylist
    // 내가 만들어준 ClientHandler 클래스 사용하기
    static Vector<ClientHandler> clntHandle = new Vector<>();
    static int i = 0;

    public static void main(String[] args) throws IOException {
        ServerSocket servSock = new ServerSocket(7777);
        Socket sock;

        for (;;) {
            System.out.println("대화상대 찾는중");
            sock = servSock.accept();
            System.out.println(sock + "입장");

            DataInputStream in = new DataInputStream(sock.getInputStream());
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());

            // 새롭게 등장한 내용
            // 클라이언트용 핸들러 작성, 서버와 클라이언트 요청에 대한 응답 할 수 있는 곳
            // ClientHandler class 사용하기
            ClientHandler ch = new ClientHandler(in, out, "client" + i, sock);

            Thread t = new Thread(ch);
            clntHandle.add(ch);
            t.start();
            i++;

            servSock.close();
        }
    }
}
