import Details.Organization;
import NetworkingFiles.Server;
import PrintingValues.PrintEmployeesData;
import PrintingValues.WriteEmployees;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{

        try {
            //Here First we Connect the server into a port value
            Server server = new Server();
            ServerSocket serverSocket = Server.getServer();

            //After the server Connection, we perform the necessary actions to retrieve the employee data
            List<Organization> organizationList = new ArrayList<>();


            String filePath = "C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Project1 - Skill Management System\\Required Files\\EmployeeData.csv";

            //Creating object of SkillManagementSystem Class to Execute all its Functions
            SkillManagementSystem skillManagementSystem = new SkillManagementSystem();
            System.out.println("Please Select method in which you want Details :" + "\n"+"1 :"+"On the basis of Skills"+"\n"+"2 :"+"On the basis of Skills and SubSkills");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice == 1) {
                 skillManagementSystem.loadDataOnSkills(filePath, organizationList);
            }else {
                skillManagementSystem.loadDataOnSubSkills(filePath, organizationList);
            }

            PrintEmployeesData.Print(organizationList);
            WriteEmployees.writeData(organizationList);

            server.SendFileToClient(serverSocket);   //Here we send the file to the client location


        }catch (FileNotFoundException e){
            System.out.println("File not found Exception Occurred !!");
        }

    }
}

