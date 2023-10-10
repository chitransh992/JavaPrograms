import java.io.*;

class Employee implements Serializable{
    int a,b,c,d;


Employee(int a,int b,int c,int d){
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
}
}
public class TwoFileOutput {

    private static void printObject(Employee Object1){
        System.out.println("\nEmployee ID1 :"+Object1.a);
        System.out.println("Employee ID2:"+Object1.b);
        System.out.println("Employee ID3 :"+Object1.c);
        System.out.println("Employee ID4 :"+Object1.d);
    }
    public static void main(String[]args) throws IOException {

        //Usage of File FileInputStream here...

        FileInputStream input1=new FileInputStream("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\InputStream\\output1.txt");
        FileInputStream input2=new FileInputStream("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\InputStream\\output2.txt");

        //Usage of SequenceInputStream here...
        SequenceInputStream inst=new SequenceInputStream(input1,input2);

        //Usage of FilterInputStream here...
        FilterInputStream bin=new BufferedInputStream(inst);

        int i;
        while((i=bin.read())!=-1) {
            System.out.print((char)i);
        }
        inst.close();
        input1.close();
        input2.close();

        byte [] arr = {35, 36, 37, 38};
        ByteArrayInputStream byt = new ByteArrayInputStream(arr);
        Employee object  = new Employee(arr[0],arr[1],arr[2],arr[3]);


        try{
            FileOutputStream fileOutputStream = new FileOutputStream(bin.toString());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);

            objectOutputStream.close();
            fileOutputStream.close();

            //System.out.println("Object has been Serialized !!");
            //printObject(object);

        }
        catch(IOException e){
            System.out.println(e);
        }

        object = null;

        try{
            FileInputStream fileInputStream = new FileInputStream(bin.toString());

            //Usage of ObjectInputStream here...

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            object = (Employee)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            //System.out.println("Object after Deserialization:");
            printObject(object);
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }

}
