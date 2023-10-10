package DefaultMethod;

interface Sayable12{
    // default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void sayMore(String msg);
    // static method
    static void sayLouder(String msg){
        System.out.println(msg);
    }
}
public class DefaultExample implements Sayable12{
    public void sayMore(String msg){     // implementing abstract method
        System.out.println(msg);
    }
    public static void main(String[] args) {
        DefaultExample dm = new DefaultExample();
        dm.say();                       // calling default method
        dm.sayMore("Work is worship");      // calling abstract method
        Sayable12.sayLouder("Helloooo...");   // calling static method
    }
}