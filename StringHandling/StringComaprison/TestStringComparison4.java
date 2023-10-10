package StringComaprison;

public class TestStringComparison4 {
    public static void main(String[] args) {
        String string1 = "Sachin";
        String string2 = "Sachin";
        String string3 = "Ratan";

        System.out.println(string1.compareTo(string2));
        System.out.println(string1.compareTo(string3));
        System.out.println(string3.compareTo(string1));

    }
}
