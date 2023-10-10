import Details.Employee;
import Details.Organization;
import Details.Skills;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class SkillManagementSystem {

    // Used to fetch organizationData into this function
    private Organization getoRCreateOrganization(String organizationID,String organizationName,List<Organization>organizationList){
        for (Organization org : organizationList){
            //If redundancy occur then is simply return's object
            if(org.getOrgID().equalsIgnoreCase(organizationID)){
                return org;
            }
        }
        //Otherwise it passes the organization data value
        Organization organization = new Organization(organizationID,organizationName);
        organizationList.add(organization);
        return organization;
    }


    // Used to fetch EmployeeData values in this function
    private Employee getoRCreateEmployee(Organization organization,String employeeName,String employeeID, String role,List<Organization> organizationList){
        for(Employee emp : Organization.getEp()){
            //If redundancy occur then is simply return's object
            if (emp.getEmpID().equalsIgnoreCase(employeeID)){
                return emp;
            }
        }
        //Otherwise it passes the Details.Employee data value
        Employee employee = new Employee(employeeID,employeeName,role);
        Organization.getEp().add(employee);
        return employee;
    }

    //Used to fetch Details.Skill values in this function
    private Skills getoRCreateSkills(Employee employee,String skillID,String skillName,List<Organization> organizationList){
       for(Skills skills : employee.getLt()){
           //If redundancy occur then is simply return's object
           if (skills.getSkillID().equalsIgnoreCase(skillID)){
               return skills;
           }
       }
        //Otherwise it passes the Details.Skills data value
       Skills skills = new Skills(skillID,skillName);
       employee.getLt().add(skills);
       return skills;
    }

    //used to map subSkillName with rating here
    private void addSubSkill(Skills skills,String subSkillName,String rating){
        Skills.getSubSkills().put(subSkillName,rating);
    }


    //This function is used to load all the employees data on the basis of skill name input
    public void loadDataOnSkills(String filepath,List<Organization> organizationList) {
       // on the basis of boolean variable the server will send the file to client
            try{
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
                String line;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please Enter the Skill name :");
                String inputValue = scanner.nextLine();
                scanner.close();

                while ((line = bufferedReader.readLine())!=null){
                    String[] values = line.split(";");

                    String organizationID = values[1];
                    String organizationName = values[0];
                    String employeeID = values[2];
                    String employeeName = values[3];
                    String role = values[4];
                    String skillID = values[5];
                    String skillName = values[6];
                    String subSkillName = values[7];
                    String rating = values[8];

                    //If the user inputted value of skill is equal to skillName of the csv file then the function is executed here
                    //This can be used to filter out the data on the csv file on the basis of user inputted value
                    if(inputValue.equalsIgnoreCase(skillName)) {
                        Organization organization = getoRCreateOrganization(organizationID, organizationName,organizationList);
                        Employee employee = getoRCreateEmployee(organization, employeeID, employeeName, role,organizationList);
                        Skills skills = getoRCreateSkills(employee, skillID, skillName,organizationList);
                        addSubSkill(skills, subSkillName, rating);
                    }
                }
            }
            catch (IOException e){
                System.out.println("IO Exception Occurred");
            }

    }

    //This function is used to load all the employee data on the basis of skill name and subSkill name input data
    public void loadDataOnSubSkills(String filepath,List<Organization> organizationList) {
        // on the basis of boolean variable the server will send the file to client
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
            String line;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter the Skill name :");
            String inputValue1 = scanner.nextLine();
            System.out.println("Please Enter the SubSkill Name :");
            String inputValue2 = scanner.nextLine();
            scanner.close();

            while ((line = bufferedReader.readLine())!=null){
                String[] values = line.split(";");

                String organizationID = values[1];
                String organizationName = values[0];
                String employeeID = values[2];
                String employeeName = values[3];
                String role = values[4];
                String skillID = values[5];
                String skillName = values[6];
                String subSkillName = values[7];
                String rating = values[8];

                //If the user inputted value of skill is equal to skillName of the csv file then the function is executed here
                //This can be used to filter out the data on the csv file on the basis of user inputted value
                if(inputValue1.equalsIgnoreCase(skillName) && inputValue2.equalsIgnoreCase(subSkillName)) {
                    Organization organization = getoRCreateOrganization(organizationID, organizationName,organizationList);
                    Employee employee = getoRCreateEmployee(organization, employeeID, employeeName, role,organizationList);
                    Skills skills = getoRCreateSkills(employee, skillID, skillName,organizationList);
                    addSubSkill(skills, subSkillName, rating);
                }
            }
        }
        catch (IOException e){
            System.out.println("IO Exception Occurred");
        }

    }
}
