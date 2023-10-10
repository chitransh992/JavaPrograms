package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class immutableClass {

    public static void main(String[] args){
        List<String> hobbyList = new ArrayList<>();
        hobbyList.add("Swiming");
        hobbyList.add("Dancing");
        Student student = new Student(1,"Ankit",hobbyList);

    }
}
