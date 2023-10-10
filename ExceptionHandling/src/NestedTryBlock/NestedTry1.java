package NestedTryBlock;

import java.lang.reflect.Array;

public class NestedTry1 {
    public static void main(String[] args) {
        try{


            //inner try catch block 1
           try{
               System.out.println("Going to divide by 0");
               int b = 40/0;
           }
           catch(ArithmeticException e){
               System.out.println(e);
           }


           //inner try catch block 2
           try{
               int array[] = new int[5];
               System.out.println(array[10]);
           }
           catch(ArrayIndexOutOfBoundsException e){
              System.out.println(e);
           }
           System.out.println("Other Expressions !!!");
        }
        catch(Exception e){
            System.out.println("Parent Exception Catch !!!!");
        }
        System.out.println("Normal Flow !!!!");
    }
}
