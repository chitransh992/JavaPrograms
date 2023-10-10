import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class SerialExample {

    //Private Print function here
    private static void printObject(Employee Object1){
        System.out.println("Value of number1 :"+Object1.number1);
        System.out.println("Value of number2 :"+Object1.number2);
        System.out.println("Name of the Employee :"+Object1.name);
        System.out.println("Age of the Employee:"+Object1.age);
    }
    public static void main(String[] args) {
        Employee object = new Employee(2,1000,"Yash",32);
        String filename = "C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Temp.ser";

        //Serialization here
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Object has been Serialized\n"+"Data Before Deserialization is :");

            printObject(object);

            object.number2 = 2000;
        }
        catch(IOException e){
            System.out.println("IOException is caught !!!");
        }

        //Deserialization here

        object = null;

        try{
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            object = (Employee)objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Object has been Deserialized\n"+"Data After Deserialization is :");
            printObject(object);
        }
        catch(IOException e){
            System.out.println("IOExeption has been caught !!!");
        }
        catch(ClassNotFoundException e){
            System.out.println("ClassNotFoundException is caught !!!!");
        }
    }
}
