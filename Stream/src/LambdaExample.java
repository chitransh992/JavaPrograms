@FunctionalInterface
interface MyLambda{
    void display();
}
//class My implements MyLambda{
//
//}
public class LambdaExample {
    public static void main(String[] args) {
        MyLambda myLambda = ()->{
                System.out.println("Hello World");
            
        };
        myLambda.display();

    }
}
