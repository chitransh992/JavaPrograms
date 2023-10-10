package StringComaprison;

public class TestStringComparison2 {
    public static void main(String[] args) {
        String string1 = "Sachin";
        String string2 = "SACHIN";

        System.out.println(string1.equals(string2));
        System.out.println(string1.equalsIgnoreCase(string2));
    }
}
