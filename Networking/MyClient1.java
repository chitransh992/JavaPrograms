import java.io.DataOutputStream;
import java.net.Socket;
public class MyClient1 {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost",6666);

            System.out.println("Connected Here !!!");

            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());

            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            socket.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
