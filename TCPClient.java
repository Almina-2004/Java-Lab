import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server.");

            // Input from server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Output to server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);
            String message;

            System.out.println("Type messages to send to server (type 'bye' to exit):");

            while (true) {
                System.out.print("Client: ");
                message = sc.nextLine();
                out.println(message); // send to server

                String response = in.readLine(); // read server response
                System.out.println("Server: " + response);

                if (message.equalsIgnoreCase("bye")) {
                    break;
                }
            }

            sc.close();
            in.close();
            out.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}