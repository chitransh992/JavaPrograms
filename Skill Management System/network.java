import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;
import java.net.ServerSocket;

public class network {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Do you want to share the file through network" +
                    "\n 1. Yes           2.No");

            int n = scanner.nextInt();

            if (n == 1) {
                getServer(3333);

            } else {
                System.out.println("Thank you !!");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    private static void getServer(int portNumber) throws IOException {
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("Server is Connected !!");

//            Socket socket  = serverSocket.accept();
//
//            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
//            String string = (String)dataInputStream.readUTF();
//            System.out.println(string);
//
//            serverSocket.close();

            File file = new File("C:\\\\Users\\\\chitransh.mathur\\\\OneDrive - Xebia\\\\Documents\\\\JavaPrograms\\\\Skill Management System\\\\DetailsOutput.csv");

            while(true){
                Socket socket = serverSocket.accept();
                byte[] myByte = new byte[(int) file.length()];

                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream.read(myByte,0,myByte.length);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(myByte,0,myByte.length);

                System.out.println("Server has Send the File to Client");

                outputStream.flush();
                socket.close();
            }

    }
}

