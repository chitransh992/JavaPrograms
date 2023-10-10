package inheritance;

public class SimpleInheritance {
    public static void main(String[] args) {
        Sample1 superObj = new Sample1();
        Sample2 subObj = new Sample2();


        //Super-class can be used by herself

        superObj.i = 10;
        superObj.j = 20;

        System.out.println("Contents of Super class : ");

        superObj.showij();

        System.out.println();

        // The subclass has access to all super class public member

        subObj.i=7;
        subObj.j=8;
        subObj.k=30;

        System.out.println("Contents of the ");

        subObj.showij();
        subObj.showK();

        System.out.println("Sum of i, j and k is :");
        subObj.sum();

    }
}
