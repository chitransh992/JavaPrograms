package GenericClasses;

@FunctionalInterface
interface MyLambda{
    void display();
}
class Myclass implements MyLambda{
    public void display(){
        System.out.println("Hello World");
    }
}
public class LambdaExpression {

    public static void main(String[] args) {
        MyLambda lambda = new My();
        lambda.display();
    }

}
