import java.io.*;
import java.net.Socket;
public class MyClient2 {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 6666);

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String string1 = "";
            String string2 = "";

            while(!string1.equals("STOP")){
                string1 = bufferedReader.readLine();
                dataOutputStream.writeUTF(string1);
                dataOutputStream.flush();
                string2 = dataInputStream.readUTF();
                System.out.println("Server Says :"+string2);
            }
            dataOutputStream.close();
            socket.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
