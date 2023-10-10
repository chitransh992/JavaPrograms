package GenericClasses;

import java.util.ArrayList;


public class TestGeneric8 {

    public static void display(ArrayList<?>list){
        for(Object object : list){
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Displaying the values of ArrayList :");
        display(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");

        System.out.println("Displaying the String Values :");
        display(list2);

    }
}
