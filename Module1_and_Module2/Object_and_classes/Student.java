package Object_and_classes;

public class Student {
    int id;
    String name;

    void insertRecord(int r, String str)
    {
        id = r;
        name = str;
    }
    void displayInfo()
    {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
