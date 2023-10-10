import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestSerialization {
    public static void main(String[] args) {
         Demo object = new Demo("Chitransh",1);
         String filename = "C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Hello.ser";

         try{
             FileOutputStream fileOutputStream = new FileOutputStream(filename);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

             objectOutputStream.writeObject(object);

             objectOutputStream.close();
             fileOutputStream.close();

             System.out.println("Object has been serialized !!!");
         }
         catch(IOException e){
             System.out.println("IOException is caught");
         }


         Demo object1 = null;

         try{
             FileInputStream fileInputStream = new FileInputStream(filename);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

             object1 = (Demo)objectInputStream.readObject();

             objectInputStream.close();
             fileInputStream.close();

             System.out.println("Object has been Deserialized !!!");
             System.out.println("name :"+object1.name);
             System.out.println("Roll_no : "+object1.rollNumber);
         }
         catch(IOException e){
             System.out.println("IOException Occured !!!");
         }
         catch(ClassNotFoundException e){
             System.out.println("ClassNotFound Exception is caught");
         }
    }
}
