import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class SkillManagementSystem {

    List<Organization> organizationList = new ArrayList<>();

    SkillManagementSystem(){
        this.organizationList = new ArrayList<>();
    }


    // Used to fetch organizationData into this function
    private Organization getoRCreateOrganization(String organizationID,String organizationName){
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
    private Employee getoRCreateEmployee(Organization organization,String employeeName,String employeeID, String role){
        for(Employee emp : Organization.getEp()){
            //If redundancy occur then is simply return's object
            if (emp.getEmpID().equalsIgnoreCase(employeeID)){
                return emp;
            }
        }
        //Otherwise it passes the Employee data value
        Employee employee = new Employee(employeeID,employeeName,role);
        Organization.getEp().add(employee);
        return employee;
    }

    //Used to fetch Skills values in this function
    private Skills getoRCreateSkills(Employee employee,String skillID,String skillName){
       for(Skills skills : employee.getLt()){
           //If redundancy occur then is simply return's object
           if (skills.getSkillID().equalsIgnoreCase(skillID)){
               return skills;
           }
       }
        //Otherwise it passes the Skills data value
       Skills skills = new Skills(skillID,skillName);
       employee.getLt().add(skills);
       return skills;
    }

    //used to map subSkillName with rating here
    private void addSubSkill(Skills skills,String subSkillName,String rating){
        Skills.getSubSkills().put(subSkillName,rating);
    }

    // Used to print all the values here
    public void printEmployees(){
            for (Organization org : organizationList) {
                System.out.println("Organization ID:" + org.getOrgID() + "\n" + "Organization Name :" + org.getNameOfOrganization());
                for (Employee emp : Organization.getEp()) {
                    System.out.println("Employee Name:" + emp.getEmpID() + "\n" + "Employee ID :" + emp.getNameOfEmployee() + "\n" + "Role :" + emp.getRole());
                    for (Skills sk : emp.getLt()) {
                        System.out.println("Skills ID:" + sk.getSkillID() + "\n" + "Skill name :" + sk.getSkillName() + " ");
                        System.out.println(Skills.getSubSkills().toString());
                        System.out.println("\n");
                    }
                }
        }

    }
    //used to write the values inside the buffered writer
    public void writeData(){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Project1 - Skill Management System\\Required Files\\outputValue.csv"));
            for (Organization org : organizationList) {
                bufferedWriter.write("Organization ID:" + org.getOrgID() + "\n" + "Organization Name :" + org.getNameOfOrganization()+"\n");
                for (Employee emp : Organization.getEp()) {
                    bufferedWriter.write("Employee Name:" + emp.getEmpID() + "\n" + "Employee ID :" + emp.getNameOfEmployee() + "\n" + "Role :" + emp.getRole()+"\n");
                    for (Skills sk : emp.getLt()) {
                        bufferedWriter.write("Skills ID:" + sk.getSkillID() + "\n" + "Skill name :" + sk.getSkillName() + " ");
                        bufferedWriter.write("\n");
                        bufferedWriter.write(Skills.getSubSkills().toString());
                    }
                }
            }
            bufferedWriter.close();
        }
        catch(IOException e){
            System.out.println("IO Exception Occurred !!");
        }
    }


    public void loadData(String filepath) {
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
                        Organization organization = getoRCreateOrganization(organizationID, organizationName);
                        Employee employee = getoRCreateEmployee(organization, employeeID, employeeName, role);
                        Skills skills = getoRCreateSkills(employee, skillID, skillName);
                        addSubSkill(skills, subSkillName, rating);
                    }
                }
            }
            catch (IOException e){
                System.out.println("IO Exception Occurred");
            }
    }
}
