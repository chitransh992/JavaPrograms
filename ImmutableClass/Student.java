package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<String> hobbies;

    public Student(int id,String name, List hobbyList){
        this.id = id;
        this.name = name;

        this.hobbies = new ArrayList<>();
        for(String hobby : hobbyList){
            hobbies.add(hobby);
        }
    }

    public int getId(){return id;}
    public String getName(){return name;}

    public List getHobbies(){
        List newList = new ArrayList<>();
        for(String hobby : hobbies){
            newList.add(hobby);
        }
        return newList;
    }



}
