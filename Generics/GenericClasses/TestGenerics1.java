package GenericClasses;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenerics1 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        list.add("Jai");
        list.add("Ramesh");
        list.add("Suresh");

        String string = list.get(0);
        System.out.println("Element is :"+string);

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
