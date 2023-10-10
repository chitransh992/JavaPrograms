package FunctionalInterface.PredicateFunctions;

import java.util.function.Predicate;

//Predicate is a functional interface having one method test which return the boolean value
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> chechLength = str->str.length()>5;
        System.out.println(chechLength.test("checkLength"));
    }
}
