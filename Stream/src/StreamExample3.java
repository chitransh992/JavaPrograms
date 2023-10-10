import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class StreamExample3 {
    public static void main(String[] args) {
        List<String> CompanyList = new ArrayList<String>();
        CompanyList.add("Google");
        CompanyList.add("Apple");
        CompanyList.add("Microsoft");

       System.out.println("Before Sorting :"+CompanyList);

       CompanyList.stream().sorted().forEach(System.out::println);

    }
}
