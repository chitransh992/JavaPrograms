import java.io.*;

class Dog implements Serializable {
    int i = 10;
    transient final int j = 20;
}
public class FinalUsageSerializationExample {
    public static void main(String[] args)throws IOException,ClassNotFoundException
    {
        Dog dog = new Dog();
        System.out.println("Serialization started !!!");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\abc.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(dog);
        System.out.println("Serialization Ended !!!");


        System.out.println("Deserialization Started !!!");
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\abc.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Dog dog2 = (Dog) objectInputStream.readObject();

        System.out.println("Deserialization Ended !!!!");
        System.out.println("Data is :");

        System.out.println(dog2.i+" "+dog2.j);
    }

}
