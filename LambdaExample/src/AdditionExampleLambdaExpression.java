@FunctionalInterface
interface Addable{
    int add(int a,int b);
}
public class AdditionExampleLambdaExpression {
    public static void main(String[] args) {
        Addable addable = (a,b)->{
            int result = 0;
            return result = (a+b);
        };
        System.out.println("The addition of the two numbers is :"+addable.add(3,4));

    }
}
