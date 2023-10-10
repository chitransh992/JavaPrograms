import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeSkill extends Employee{

    public static void main(String[] args) {
        try {
            // The required file Which contains all the details
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Project1-Skill Management System\\Required Files\\Details.csv"));
            String line;


            Scanner sc = new Scanner(System.in);

            //Getting the Required input from the user
            System.out.println("Enter the Role of Employee : ");
            String skill1 = sc.nextLine();

            System.out.println("Enter the Skill of the Employee : ");
            String skill2 = sc.nextLine();

            System.out.println("Enter the SubSkill of the Employee : ");
            String skill3 = sc.nextLine();

            //List is used to store all the similar type of employees dataset
            List<Employee> employees = new ArrayList<>();


            //The string line read all csv file content till null value
            while ((line = bufferedReader.readLine())!=null){
                String[] values = line.split(",");   // Separating with regex value

                String organizationName = values[0];
                String EmployeeID = values[1];
                String EmployeeName = values[2];
                String Role = values[3];
                String ParentSkill = values[4];
                String SubSkill = values[5];
                String Rating = values[6];

                //Matching the required user input skill with the csv file content
                if(values[4].equals(skill1) && values[5].equals(skill2) && values[6].equals(skill3)){

                    Employee employee = new Employee(organizationName,EmployeeID,EmployeeName,Role,ParentSkill,SubSkill,Rating);
                    employees.add(employee);

                    //Displaying the value
                    System.out.println(employee.getOrgName()+" "+employee.getEmployeeID()+""+employee.getEmployeeName()+" "+employee.getRole()+" "+employee.Skill+" "+employee.subSkill+" "+employee.skillLevel+" ");


                    try {
                        //Here the bufferedWriter will write the content into the file
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Project1-Skill Management System\\Required Files\\DetailsOutput.csv"));
                        bufferedWriter.write(employee.getOrgName()+","+employee.getEmployeeID()+","+employee.getEmployeeName()+","+employee.getRole()+","+employee.skill()+","+employee.subSkill()+","+employee.skillLevel());
                        bufferedWriter.close();
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                }

            }
        }
        catch(IOException e){
            System.out.println();
        }
    }

}
