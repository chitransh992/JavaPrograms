@FunctionalInterface
interface NumericTest{
    boolean test(int n);
}
public class LambdaExample3 {
    public static void main(String[] args) {

        //first lambda expression
        NumericTest isEven;
        isEven = n->(n%2 == 0);

        if(!isEven.test(9)){
            System.out.println("9 is not even");
        }
        if(isEven.test(10)){
            System.out.println("10 is even");
        }

        //second lambda expression
        NumericTest isNonNeg;
        isNonNeg = n->n>=0;
        if(isNonNeg.test(100)){
            System.out.println("100 is a positive number");
        }
        if(!isNonNeg.test(-100)){
            System.out.println("-100 is non negative number");
        }
    }
}

/* points to consider here :-
1. for single parameter we do not need to give parenthesis, (n)->n%2 == 0 can be written as n->n%2 == 0
2. one functional interface can execute multiple lambda expressions, here NumericTest execute two lambda expressions isEven and isNonNeg
3. The type of the parameter n is inferred by the parametr type of test ie 100 and -100 which is int
 */
