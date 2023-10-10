import java.util.*;

public class Swapping_2_numbers_using_3_variable {
    public static void main(String[] args) {
        int x,y,temp;

        System.out.println("Enter x and y :");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before Swapping \nx :"+x+"\ny"+y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping : \nx ="+x+"\ny="+y);
    }
}
