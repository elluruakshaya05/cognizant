import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Connected to server.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            String message;
            while (true) {
                System.out.print("You: ");
                message = userInput.readLine();
                out.println(message);

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                message = in.readLine();
                System.out.println("Server: " + message);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
