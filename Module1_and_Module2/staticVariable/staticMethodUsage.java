package staticVariable;

class Student1{
    int roll_no;
    String name;
    static String collage = "JECRC";

    static void change()
    {
         collage = "Poornima";
    }
    Student1(int r, String n)
    {
        roll_no = r;
        name = n;
    }
    void display(){
        System.out.println(roll_no+" "+name+" "+collage+" ");
    }
}
public class staticMethodUsage {
    public static void main(String[] args) {
        Student1.change();
        Student1 s1 = new Student1(11,"Aryan");
        Student1 s2 = new Student1(12,"Ramesh");
        s1.display();
        s2.display();

    }
}
