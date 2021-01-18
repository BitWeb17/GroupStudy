package Fourteenth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SocketClient {
    private Socket mSocket;

    private BufferedReader mIn;
    private PrintWriter mOut;

    public SocketClient(Sttring ip, int portt){
        try {
            mSocket = new Socket(ip, port);
            System.out.println(ip + "연결됨");

            mIn = new BufferedReader(
                    new InputStreamReader(mSocket.getInputStream())
            );
            mOut = new PrintWritter(mSocket.getOutputStream());
        }catch (IOEexception e ){
            System.out.println(e.gettMessage());
            )
        }
    }
}
