package NetworkingFiles;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.util.Random;

//The client here received the output file into the port number provided
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Client is Connected !!!");

        try {
            Socket socket = new Socket("localhost", 3333);

            byte[] myByte = new byte[1024];

            InputStream inputStream = socket.getInputStream();

            //This File location contains the result output value
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\SampleProject\\ClientOutputFiles\\" +new Random().nextInt(10000)+".csv");

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            int byteReads = inputStream.read(myByte, 0, myByte.length);

            bufferedOutputStream.write(myByte, 0, byteReads);

            System.out.println("Client Received the File");

            bufferedOutputStream.close();

            socket.close();
        }
        catch (SocketException e){
            System.out.println("Socket Not Found Exception !");
        }

    }
}
