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

    String Department;
    String role;
    String mainSkill;
    String mainSkillLevel;
    String subSkill;
    String subSkillLevel;


    Employee(String orgName,String EmployeeID,String EmployeeName,String Department,String role,String mainSkill, String mainSkillLevel, String subSkillLevel){
        this.orgName = orgName;
        this.EmployeeID = EmployeeID;
        this.Department = Department;
        this.EmployeeName = EmployeeName;
        this.role = role;
        this.mainSkill = mainSkill;
        this.mainSkillLevel = mainSkillLevel;
        this.subSkillLevel = subSkillLevel;
    }

    public Employee() {
        
    }

    public Employee(String organizationName, String employeeID, String employeeName, String department, String role, String mainSkill, String mainSkillLevel, String subSkill, String subSkillLevel) {

    }

    public Employee(String organizationName, String e
















































































































































































































                    mployeeID, String employeeName, String role, String parentSkill, String subSkill, String rating) {

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

    public String getDepartment(){return Department;}
    public String getRole(){
        return role;
    }
    public String getMainSkill(){
        return mainSkill;
    }
    public String getMainSkillLevel(){
        return mainSkillLevel;
    }
    public String getSubSkill(){
        return subSkill;
    }

    public String getSubSkillLevel(){return subSkillLevel;}

}

