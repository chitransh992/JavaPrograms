package Throws;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrow2 {

    public static void method()throws FileNotFoundException
    {
        FileReader fileReader = new FileReader("kjnlndc");
        BufferedReader fileInput = new BufferedReader(fileReader);

        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try {
            method();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code !!!");

    }

}
