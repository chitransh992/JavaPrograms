package TryCatchBlock;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//File not found Exception Handling
public class TryCatch4 {
    public static void main(String[] args) {
        PrintWriter printWriter;
        try{
            printWriter = new PrintWriter("jpt.txt");
            printWriter.println("It is saved");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("Rest of the Code !!");

    }
}
