
@FunctionalInterface
interface Factorial{
    int factorial(int n);
}


public class FactorialLambdaExample {
    public static void main(String[] args) {
        Factorial fact = (n)->{
            int result = 1;
            for(int i = 1;i<=n;i++){
                result = result*i;
            }
            return result;
        };
        System.out.println("The factorial of 3 is :"+fact.factorial(3));
    }
}
