import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ramesh");
        arrayList.add("Suresh");
        arrayList.add("Naresh");

        Iterator itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
