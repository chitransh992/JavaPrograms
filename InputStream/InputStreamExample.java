// Java program illustrating the working of PipedInputStream
// connect(), read(byte[] buffer, int offset, int maxlen),
// close(), available()

import java.io.*;
public class InputStreamExample
{
    public static void main(String[] args) throws IOException
    {
        PipedInputStream geek_input = new PipedInputStream();
        PipedOutputStream geek_output = new PipedOutputStream();
        try
        {
            // Use of connect() : connecting geek_input with geek_output
            geek_input.connect(geek_output);

            byte[] arr = {71,69,69,75,83};


            // Use of available() :
            System.out.println("Use of available() : " + geek_input.available());

            // Use of read(byte[] buffer, int offset, int maxlen) :
            byte[] buffer = new byte[5];
            // destination 'buffer'
            geek_input.read(buffer, 0, 5);

            String str = new String(buffer);
            System.out.println("Using read(buffer, offset, maxlen) : " + str);

            // USe of close() method :
            System.out.println("Closing the stream");
            geek_input.close();

        }
        catch (IOException except)
        {
            except.printStackTrace();
        }
    }
}
