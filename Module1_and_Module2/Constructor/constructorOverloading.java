package Constructor;


import Object_and_classes.Student;

public class constructorOverloading {
    int id,age;
    String name;
    constructorOverloading(int i, String n)
    {
      id = i;
      name = n;
    }
    constructorOverloading(int i, String n, int r)
    {
        id = i;
        name = n;
        age = r;
    }
    void display()
    {
        System.out.println(id+""+name+""+age+"");
    }

    public static void main(String[] args) {
     constructorOverloading s1 = new constructorOverloading(1," ramesh");
     constructorOverloading s2 = new constructorOverloading(3," suresh",21);
     s1.display();
     s2.display();
    }
}
