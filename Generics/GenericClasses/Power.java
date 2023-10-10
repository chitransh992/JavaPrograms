package GenericClasses;

import java.util.Scanner;
import java.util.*;

public class Power {
    public static int pow(int a, int b,int res){

        if(b == 0){
            return res;
        }

        res=res*a;
        return pow(a,b-1,res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter the power :");
        int p = sc.nextInt();
        int result,res = 1;

        result = Power.pow(n,p,res);
        System.out.println(result);
    }
}
