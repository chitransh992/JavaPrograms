package superKeyword;


class employee{
    int id;
    String name;

    employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}
class amount extends employee{
    int salary;
    amount(int id,String name,int salary) {
        super(id, name);
        this.salary = salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary+" ");
    }
}
public class testSuper1 {
    public static void main(String[] args) {
        amount e = new amount(1,"Ankit",10000);
        e.display();

    }
}
