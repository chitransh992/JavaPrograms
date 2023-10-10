package inheritance;

class x{
    void run(){
        System.out.println("Running");
    }
}
class y extends x{
    void sleep(){
        System.out.println("Sleeping");
    }
}
class z extends y{
    void show(){
        System.out.println("Showing");
    }
}
public class multiLevelInheritance {
    public static void main(String[] args) {
        z obj = new z();
        obj.run();
        obj.show();
        obj.sleep();
    }
}
