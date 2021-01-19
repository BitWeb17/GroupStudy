import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class DiceClient {
    public static void main(String[] args) {

        String hostname = "110.70.58.14";
        int port = 5555;

        for (int i = 0; i < 10; i++) {
            try {
                Socket socket = new Socket(hostname, port);

                OutputStream out = socket.getOutputStream();
                PrintWriter printWriter = new PrintWriter(out, true);

                Dice dice = new Dice();
                printWriter.println(dice.randomDice());

                InputStream input = socket.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input));

                System.out.println(bufferedReader.read());
            } catch (UnknownHostException e) {
                System.out.println("Server Not Found: " + e.getMessage());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
