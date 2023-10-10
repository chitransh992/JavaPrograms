package Object_and_classes;


public class TestStudent2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.insertRecord(111,"Aryan");
        s2.insertRecord(121,"Ramesh");

        s1.displayInfo();
        s2.displayInfo();


    }
}
