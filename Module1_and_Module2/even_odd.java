import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        System.out.println("Enter the number for odd even :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2 == 0)
        {
            System.out.println("It is even Number");
        }
        else
        {
            System.out.println("It is odd number");
        }
    }
}
