package PrintingValues;

import Details.Employee;
import Details.Organization;
import Details.Skills;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteEmployees {

    //used to write the values inside the buffered writer
    public static void writeData(List<Organization> organizationList){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Project1 - Skill Management System\\Required Files\\outputValue.csv"));
            for (Organization org : organizationList) {
                bufferedWriter.write("Details.Organization ID:" + org.getOrgID() + "\n" + "Details.Organization Name :" + org.getNameOfOrganization()+"\n");
                for (Employee emp : Organization.getEp()) {
                    bufferedWriter.write("Details.Employee Name:" + emp.getEmpID() + "\n" + "Details.Employee ID :" + emp.getNameOfEmployee() + "\n" + "Role :" + emp.getRole()+"\n");
                    for (Skills sk : emp.getLt()) {
                        bufferedWriter.write("Details.Skills ID:" + sk.getSkillID() + "\n" + "Skill name :" + sk.getSkillName() + " ");
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
}
