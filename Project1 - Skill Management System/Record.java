import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Record {
    public static void main(String[] args) throws IOException{
        String filePath = "C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Project1 - Skill Management System\\Required Files\\EmployeeData.csv";
        SkillManagementSystem skillManagementSystem = new SkillManagementSystem();
        skillManagementSystem.loadData(filePath);
        skillManagementSystem.printEmployees();
        skillManagementSystem.writeData();
        Server server = new Server();
        server.getServer();
    }
}

