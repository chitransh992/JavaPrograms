import java.io.*;
import java.net.Socket;
public class Client {
    public static void main(String[] args) throws IOException {
            System.out.println("Client is Connected !!!");

            Socket socket = new Socket("localhost", 3333);

            byte[] myByte = new byte[1024];

            InputStream inputStream = socket.getInputStream();

            FileOutputStream fileOutputStream = new FileOutputStream("C:\\\\Users\\\\chitransh.mathur\\\\OneDrive - Xebia\\\\Documents\\\\JavaPrograms\\\\Skill Management System\\\\ClientOutput.csv");

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            int byteReads = inputStream.read(myByte,0,myByte.length);

            bufferedOutputStream.write(myByte,0,byteReads);

            System.out.println("Client Received the File");

            bufferedOutputStream.close();

            socket.close();

    }
}
