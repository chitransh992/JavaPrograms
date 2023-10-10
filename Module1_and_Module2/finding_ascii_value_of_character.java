import java.util.*;
public class finding_ascii_value_of_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to get ASCII value :");
        char ch = sc.next().charAt(0);
        int ascii = (int)ch;
        System.out.println(ascii);
    }
}
