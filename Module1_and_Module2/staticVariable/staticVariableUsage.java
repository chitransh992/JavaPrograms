package staticVariable;

import Object_and_classes.Student;

class student{
    int roll_no;
    String name;
    static String collage = "JECRC";     //Static variable usage which takes only one time memory at the time of Classloading

    student(int r,String n)
    {
        roll_no = r;
        name = n;
    }
   void display()
   {
       System.out.println(roll_no+" "+name+" "+collage+" ");
   }
}

public class staticVariableUsage {
    public static void main(String[] args) {
        student s1 = new student(111,"Aryan");
        student s2 = new student(121,"Chitransh");
        s1.display();
        s2.display();
    }

}
