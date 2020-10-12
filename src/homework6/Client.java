package homework6;

import javafx.fxml.Initializable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        final String IP_ADDRESS = "localhost";
        final int PORT = 8189;

        Socket socket = null;
        Scanner scanner = new Scanner(System.in);


        try {
            socket = new Socket(IP_ADDRESS, PORT);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            new Thread(() -> {
                try {
                    while (true) {
                        String str = in.readUTF();
                        if (str.equals("/end")) {
                            break;
                        }
                        System.out.println("Server: " + str);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            try {
                while (true){
//                    System.out.println("\nClient: ");
                    out.writeUTF(scanner.nextLine());

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            socket.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





