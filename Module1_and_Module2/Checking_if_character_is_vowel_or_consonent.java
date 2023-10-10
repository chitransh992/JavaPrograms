import java.util.*;
public class Checking_if_character_is_vowel_or_consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character value to check if it is vowel or consonent :");

        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
        {
            System.out.println("The character is vowel");
        }
        else{
            System.out.println("The character is consonent");
        }
    }
}
