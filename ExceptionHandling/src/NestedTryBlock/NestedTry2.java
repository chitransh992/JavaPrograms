package NestedTryBlock;

import java.lang.reflect.Array;

public class NestedTry2 {
    public static void main(String[] args) {
        try {
            try {
                try {
                    int array[] = {1, 2, 3};
                    System.out.println(array[10]);
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
