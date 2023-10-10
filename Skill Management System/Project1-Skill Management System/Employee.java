import javax.naming.Name;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Employee {

    String orgName;
    String EmployeeID;
    String EmployeeName;
    String role;
    String Skill;
    String subSkill;
    String skillLevel;

    Employee(String orgName,String EmployeeID,String EmployeeName,String role,String Skill, String subSkill, String skillLevel){
        this.orgName = orgName;
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.role = role;
        this.subSkill = subSkill;
        this.Skill = Skill;
        this.skillLevel = skillLevel;
    }

    public Employee() {

    }


    public String getOrgName(){
        return orgName;
    }
    public String getEmployeeID(){
        return EmployeeID;
    }
    public String getEmployeeName(){
        return EmployeeName;
    }
    public String getRole(){
        return role;
    }
    public String subSkill(){
        return subSkill;
    }
    public String skill(){
        return Skill;
    }
    public String skillLevel(){
        return skillLevel;
    }

}

