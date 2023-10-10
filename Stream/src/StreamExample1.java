import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(20);

        System.out.println("Printing the Collection :"+arrayList);
        System.out.println();

        ArrayList<Integer> list = (ArrayList<Integer>) arrayList.stream().filter(i->i%2 == 0).collect(Collectors.toList());

        System.out.println("Printing the list after stream operation :"+list);
    }
}
