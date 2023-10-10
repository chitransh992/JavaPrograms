package MethodReference;
//Referring Static Method
interface Sayable{
    void say();
}
public class MethodReferenceExample {
    public static void saySomething(){
        System.out.println("Hello Method");
    }

    public static void main(String[] args) {
        Sayable sayable = MethodReferenceExample :: saySomething;
        sayable.say();
    }
}
