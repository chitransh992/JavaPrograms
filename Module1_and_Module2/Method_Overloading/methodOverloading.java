package Method_Overloading;
import java.util.Scanner;

class Overloading{
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b,int c)
    {
        System.out.println(a+b+c);
    }
    void sum(double a, double b)
    {
        System.out.println(a+b);
    }
}
public class methodOverloading {
    public static void main(String[] args) {
       Overloading obj = new Overloading();
       obj.sum(6,7);
       obj.sum(4,5,6);

    }
}
