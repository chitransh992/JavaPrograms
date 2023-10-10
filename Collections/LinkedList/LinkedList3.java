import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Ramesh");
        list.add("Mahesh");
        list.add("Akshat");

        Iterator itr = list.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
