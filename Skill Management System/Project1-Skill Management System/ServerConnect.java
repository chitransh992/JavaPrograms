    import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ServerConnect {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Do you want to share the file through network" +
                    "\n 1. Yes           2.No");

            int n = scanner.nextInt();

            if (n == 1) {
                getServer();   //GetServer function to execute the function with a port number

            } else {
                System.out.println("Thank you !!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void getServer() throws IOException
    {
        ServerSocket serverSocket = new ServerSocket(3333);
        System.out.println("Server is Connected !!");

        //The file path which is sending by user
        File file = new File("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Project1-Skill Management System\\Required Files\\DetailsOutput.csv");

        try {
            while (true) {
                Socket socket = serverSocket.accept();

                // The byte[] will create an bytearray[] which is equal to the size of file and get all the contents in the byte array
                byte[] myByte = new byte[(int) file.length()];

                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream.read(myByte, 0, myByte.length); // read method contains[bytes to read,starting offset where data to be stored, total length to be read]

                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(myByte, 0, myByte.length);

                System.out.println("Server has Send the File to Client");

                outputStream.flush();
                socket.close();
            }
        } catch (SocketException e) {
            System.out.println("Socket Not Found Exception !");
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception occurred !");
        }
    }
}

