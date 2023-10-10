import java.util.ArrayList;
import java.util.Iterator;
class Student{
    String name;
    int roll_no;
    int age;
    Student(String name, int roll_no, int age){
        this.name = name;
        this.roll_no = roll_no;
        this.age = age;
    }
}
public class ArrayList5 {
    public static void main(String[] args) {
      Student student1 = new Student("chitrash",101,21);
      Student student2 = new Student("Yash",102,22);

      ArrayList<Student> arrayList = new ArrayList<Student>();

      arrayList.add(student1);
      arrayList.add(student2);

      Iterator itr = arrayList.iterator();
      while(itr.hasNext()){
          Student st = (Student)itr.next();
          System.out.println(st.roll_no+" "+st.name+" "+st.age+" ");
      }
    }
}
