import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Yash");
        al.add("Ramesh");

        ArrayList<String> al2 = new ArrayList<String>();

        al2.add("Hanuman");
        al2.add("Aaaa");

        al.retainAll(al2);

        System.out.println("Iteration after that :");

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
