package StringComaprison;

public class TestStringComparison1 {
    public static void main(String[] args) {
        String string1 = "Sachin";
        String string2 = "Sachin";

        String string3 = new String("Sachin");
        String string4 = "Saurav";

        System.out.println(string1.equals(string2));
        System.out.println(string1.equals(string3));
        System.out.println(string1.equals(string4));

    }

}
