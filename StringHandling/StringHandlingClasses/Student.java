package StringHandlingClasses;

public class Student {
    int roll_no;
    String name;

    String city;

    public Student(int roll_no, String name, String city){
        this.roll_no = roll_no;
        this.name = name;
        this.city = city;
    }

    public String toString(){
        return roll_no+" "+name+" "+city+" ";
    }
}
