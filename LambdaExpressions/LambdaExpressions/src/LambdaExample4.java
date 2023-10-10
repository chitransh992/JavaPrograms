@FunctionalInterface
interface NumericFunc{
    int func(int n);
}
public class LambdaExample4 {
    public static void main(String[] args) {
        NumericFunc factorial;

        //HERE WE USE BLOCK LAMBDA'S BECAUSE IT CONTAINS MORE THAN ONE STATEMENT
        factorial = (n)->{
            int result = 1;
            for(int i = 1;i<=n;i++)
            {
                result*=i;
            }
            return result;
        };
        System.out.println("The factorial of 3 is :"+factorial.func(3));
        System.out.println("The factorial of 5 is :"+factorial.func(5));
    }
}
