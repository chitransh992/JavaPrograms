package ToString;
import StringHandlingClasses.Student;
public class ToString {
    public static void main(String[] args) {
        Student student = new Student(101,"Yash","Jaipur");
        Student student1 = new Student(102,"Ramesh","Ahemdabad");

        System.out.println(student);
        System.out.println(student1);
    }
}
