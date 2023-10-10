@FunctionalInterface
interface MyLambda{
    void displayValues();
}
class Myclass implements MyLambda{
    @Override
    public void displayValues() {
     System.out.println("Hello World");
    }
}
public class LambdaExample {
    public static void main(String[] args) {
        MyLambda myclass = new Myclass(){

        };
        myclass.displayValues();
    }
}
