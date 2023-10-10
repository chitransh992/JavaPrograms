package GenericClasses;

import java.util.ArrayList;

public class TestGenerics9 {

    public static void display(ArrayList<? super Integer>list){
        for(Object object : list){
            System.out.println(object);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        //list1.add(1.0);
        System.out.println("Displaying the Integer Values: ");

        display(list1);

        ArrayList<Number>list2 = new ArrayList<>();
        list2.add(1.0);
        list2.add(2.0);
        list2.add(3.0);
        System.out.println("Displaying the Double Values : ");

        display(list2);
    }
}
