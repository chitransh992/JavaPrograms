package PrintingValues;

import Details.Employee;
import Details.Organization;
import Details.Skills;

import java.util.List;

public class PrintEmployeesData{
    // Used to print all the values here
    public static void Print(List<Organization>organizationList){
        for (Organization org : organizationList) {
            System.out.println("Details.Organization ID:" + org.getOrgID() + "\n" + "Details.Organization Name :" + org.getNameOfOrganization());
            for (Employee emp : Organization.getEp()) {
                System.out.println("Details.Employee Name:" + emp.getEmpID() + "\n" + "Details.Employee ID :" + emp.getNameOfEmployee() + "\n" + "Role :" + emp.getRole());
                for (Skills sk : emp.getLt()) {
                    System.out.println("Details.Skills ID:" + sk.getSkillID() + "\n" + "Skill name :" + sk.getSkillName() + " ");
                    System.out.println(Skills.getSubSkills().toString());
                    System.out.println("\n");
                }
            }
        }
    }
}
