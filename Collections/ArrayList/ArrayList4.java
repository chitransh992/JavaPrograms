import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Banana");
        list.add("Mango");
        list.add("Apple");

        Collections.sort(list);

        for(String str : list){
            System.out.println(str);
        }

        System.out.println("Sorting Numbers :");

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(21);
        list1.add(9);
        list1.add(10);
        list1.add(77);
        Collections.sort(list1);

        System.out.println(list1);


    }
}
