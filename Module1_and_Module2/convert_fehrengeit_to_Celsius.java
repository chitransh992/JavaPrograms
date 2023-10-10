import java.util.*;
public class convert_fehrengeit_to_Celsius {
    public static void main(String[] args) {
        float temprature;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the temprature in Fehrenheit :");
        temprature = sc.nextInt();

        temprature = ((temprature-32)*5)/9;

        System.out.println("Temprature in celsius is : "+temprature);

    }
}
