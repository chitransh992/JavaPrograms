package Object_and_classes;
import java.util.Scanner;
class Calculation{
    void fact(int r)
    {
        int fact = 1;
        for(int i = 1;i<=r;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial is "+fact);
    }
}

public class anonymousObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get Factorial :");
        int num = sc.nextInt();
        new Calculation().fact(num);
    }
}
