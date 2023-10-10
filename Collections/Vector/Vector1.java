import java.util.Iterator;
import java.util.Vector;
public class Vector1 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Suresh");
        v.add("Ramesh");

        Iterator<String> itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
