import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        System.out.println("Current Elements :"+arrayList);

        List<Integer> list = arrayList.stream().map(i->i+6).collect(Collectors.toList());

        System.out.println("After mapping 6 to the elements :"+list);
    }
}
