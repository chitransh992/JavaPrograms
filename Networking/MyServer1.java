
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
public class MyServer1 {
    public static void main(String[] args) {
        try{
             ServerSocket ss = new ServerSocket(6666);

             System.out.println("Server Started here !!");
             System.out.println("Waiting for Client to Accept");

             Socket s = ss.accept();

             System.out.println("Client Accepted the Request !");

             DataInputStream dis = new DataInputStream(s.getInputStream());
             String string = (String)dis.readUTF();
             System.out.println("Message :"+string);
             ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
