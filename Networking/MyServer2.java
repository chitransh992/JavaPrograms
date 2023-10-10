import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.BufferedReader;

public class MyServer2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            // Waiting for the acceptance here
            Socket socket = serverSocket.accept();

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String string1 = "";
            String string2 = "";

            while(!string1.equals("STOP")){

                string1 = dataInputStream.readUTF();
                System.out.println("Client Says here :"+string1);

                string2 = bufferedReader.readLine();
                dataOutputStream.writeUTF(string2);

                dataOutputStream.flush();
            }
            dataInputStream.close();
            socket.close();
            serverSocket.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
