public class TestImmutableString {
    public static void main(String[] args) {

        //Strings are immutable hence it will print only "Hello"

        String string1 = "Hello";
        string1.concat("World");
        System.out.println(string1);
    }
}
