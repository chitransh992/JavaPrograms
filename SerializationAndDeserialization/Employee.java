import java.io.Serializable;

public class Employee implements Serializable {
    transient int number1;
    static int number2;

    String name;
    int age;

    Employee(int number1,int number2,String name, int age){
        this.number1 = number1;
        this.number2 = number2;
        this.name = name;
        this.age = age;
    }
}

