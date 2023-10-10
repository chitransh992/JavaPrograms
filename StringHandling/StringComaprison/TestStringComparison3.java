package StringComaprison;

public class TestStringComparison3 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = new String("Hello");

        System.out.println(string1 == string2);  //True,Because both refer to same instance
        System.out.println(string1 == string3);  //False,Because string3 refers to instance created in non pool
    }
}
