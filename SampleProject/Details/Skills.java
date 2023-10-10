package Details;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Skills {
    private String SkillID;

    private static String skillName;

    private static Map<String,String> subSkills;


    public String getSkillID() {
        return SkillID;
    }
    public static String getSkillName() {
        return skillName;
    }
    public static Map<String,String> getSubSkills(){
        return subSkills;
    }
    public Skills(String SkillID, String skillName){
        this.SkillID = SkillID;
        this.skillName = skillName;
        this.subSkills = new HashMap<>();
    }
}
