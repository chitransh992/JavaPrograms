//The Generic functional interface in which the T specify both the parameter and return type of the function
@FunctionalInterface
interface Generic<T>{
    T generic(T t);
}
public class GenericFunctionalInterface {
    public static void main(String[] args) {

        Generic<Integer>factorial;

        factorial = (n)->{
            int result = 1;
            for(int i = 1;i<=n;i++){
                result*=i;
            }
            return result;
        };
        System.out.println("The factorial of 3 is :"+factorial.generic(3));
        System.out.println("The factorial of 5 is :"+factorial.generic(5));


        Generic<String>reverse;

        reverse = (str)->{
            String result = "";
            int n = str.length()-1;
            for(int i = n;i>=0;i--){
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("The reverse of the string value Lambda is :"+reverse.generic("Lambda"));
        System.out.println("The reverse of the string value Expressions is :"+reverse.generic("Expressions"));

    }
}
