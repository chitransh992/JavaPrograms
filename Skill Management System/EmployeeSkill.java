import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EmployeeSkill extends Employee implements Organization {


    public EmployeeSkill() {

    }


    @Override
    public void xebia() {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\Company Profiles\\Xebia.csv"));
            String line="";


            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Name of Employee : ");
            String skill1 = sc.nextLine();

            System.out.println("Enter the Role of the Employee : ");
            String skill2 = sc.nextLine();

            List<Employee> employees = new ArrayList<>();


            while ((line = bufferedReader.readLine())!=null){
                String[] values = line.split(";");

                String organizationName = values[0];
                String EmployeeName = values[1];
                String EmployeeID = values[2];
                String Department = values[3];
                String Role = values[4];
                String MainSkill = values[5];
                String MainSkillLevel = values[6];
                String SubSkill  = values[7];
                String SubSkillLevel = values[8];

                System.out.println(values[1]+"");

                if(values[1].equals(skill1) && values[4].equals(skill2)){

                    Employee employee = new Employee(organizationName,EmployeeID,EmployeeName,Department,Role,MainSkill,MainSkillLevel,SubSkill,SubSkillLevel);
                    employees.add(employee);
                    System.out.println(employee.getOrgName()+" "+employee.getEmployeeID()+""+employee.getEmployeeName()+" "+employee.getDepartment()+" "+employee.getRole()+" "+employee.getMainSkill()+" "+employee.getMainSkillLevel()+" "+employee.getSubSkill()+" "+employee.getSubSkillLevel()+" ");


                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\DetailsOutput.csv"));
                        bufferedWriter.write(employee.getOrgName()+","+employee.getEmployeeID()+","+employee.getEmployeeName()+","+employee.getDepartment()+","+employee.getRole()+","+employee.getMainSkill()+","+employee.getMainSkillLevel()+","+employee.getSubSkill()+","+employee.getSubSkillLevel());
                        bufferedWriter.close();
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                }

            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    @Override
    public void google() {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\Company Profiles\\google.csv"));
            String line="";


            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Name of Employee : ");
            String skill1 = sc.nextLine();

            System.out.println("Enter the Role of the Employee : ");
            String skill2 = sc.nextLine();

//            List<Employee> employees = new ArrayList<>();


            while ((line = bufferedReader.readLine())!=null){
                String[] values = line.split(",");

                String organizationName = values[0];
                String EmployeeName = values[1];
                String EmployeeID = values[2];
                String Department = values[3];
                String Role = values[4];
                String MainSkill = values[5];
                String MainSkillLevel = values[6];
                String SubSkill  = values[7];
                String SubSkillLevel = values[7];

                if(values[1].equals(skill1) && values[4].equals(skill2)){

                    Employee employee = new Employee(organizationName,EmployeeID,EmployeeName,Department,Role,MainSkill,MainSkillLevel,SubSkill,SubSkillLevel);
//                    employees.add(employee);
                    System.out.println(employee.getOrgName()+" "+employee.getEmployeeID()+""+employee.getEmployeeName()+" "+employee.getDepartment()+" "+employee.getRole()+" "+employee.getMainSkill()+" "+employee.getMainSkillLevel()+" "+employee.getSubSkill()+" "+employee.getSubSkillLevel()+" ");


                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\DetailsOutput.csv"));
                        bufferedWriter.write(employee.getOrgName()+","+employee.getEmployeeID()+","+employee.getEmployeeName()+","+employee.getDepartment()+","+employee.getRole()+","+employee.getMainSkill()+","+employee.getMainSkillLevel()+","+employee.getSubSkill()+","+employee.getSubSkillLevel());
                        bufferedWriter.close();
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                }

            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    @Override
    public void IBM() {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\Company Profiles\\IBM.csv"));
            String line="";


            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Name of Employee : ");
            String skill1 = sc.nextLine();

            System.out.println("Enter the Role of the Employee : ");
            String skill2 = sc.nextLine();

            List<Employee> employees = new ArrayList<>();


            while ((line = bufferedReader.readLine())!=null){
                String[] values = line.split(",");

                String organizationName = values[0];
                String EmployeeName = values[1];
                String EmployeeID = values[2];
                String Department = values[3];
                String Role = values[4];
                String MainSkill = values[5];
                String MainSkillLevel = values[6];
                String SubSkill  = values[7];
                String SubSkillLevel = values[7];

                if(values[1].equals(skill1) && values[4].equals(skill2)){

                    Employee employee = new Employee(organizationName,EmployeeID,EmployeeName,Department,Role,MainSkill,MainSkillLevel,SubSkill,SubSkillLevel);
                    employees.add(employee);
                    System.out.println(employee.getOrgName()+" "+employee.getEmployeeID()+""+employee.getEmployeeName()+" "+employee.getDepartment()+" "+employee.getRole()+" "+employee.getMainSkill()+" "+employee.getMainSkillLevel()+" "+employee.getSubSkill()+" "+employee.getSubSkillLevel()+" ");


                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\DetailsOutput.csv"));
                        bufferedWriter.write(employee.getOrgName()+","+employee.getEmployeeID()+","+employee.getEmployeeName()+","+employee.getDepartment()+","+employee.getRole()+","+employee.getMainSkill()+","+employee.getMainSkillLevel()+","+employee.getSubSkill()+","+employee.getSubSkillLevel());
                        bufferedWriter.close();
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                }

            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    @Override
    public void Microsoft() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\Company Profiles\\Microsoft.csv"));
            String line="";


            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Name of Employee : ");
            String skill1 = sc.nextLine();

            System.out.println("Enter the Role of the Employee : ");
            String skill2 = sc.nextLine();

            List<Employee> employees = new ArrayList<>();


            while ((line = bufferedReader.readLine())!=null){
                String[] values = line.split(",");

                String organizationName = values[0];
                String EmployeeName = values[1];
                String EmployeeID = values[2];
                String Department = values[3];
                String Role = values[4];
                String MainSkill = values[5];
                String MainSkillLevel = values[6];
                String SubSkill  = values[7];
                String SubSkillLevel = values[7];

                if(values[2].equals(skill1) && values[4].equals(skill2)){

                    Employee employee = new Employee(organizationName,EmployeeID,EmployeeName,Department,Role,MainSkill,MainSkillLevel,SubSkill,SubSkillLevel);
                    employees.add(employee);
                    System.out.println(employee.getOrgName()+" "+employee.getEmployeeID()+""+employee.getEmployeeName()+" "+employee.getDepartment()+" "+employee.getRole()+" "+employee.getMainSkill()+" "+employee.getMainSkillLevel()+" "+employee.getSubSkill()+" "+employee.getSubSkillLevel()+" ");


                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\DetailsOutput.csv"));
                        bufferedWriter.write(employee.getOrgName()+","+employee.getEmployeeID()+","+employee.getEmployeeName()+","+employee.getDepartment()+","+employee.getRole()+","+employee.getMainSkill()+","+employee.getMainSkillLevel()+","+employee.getSubSkill()+","+employee.getSubSkillLevel());
                        bufferedWriter.close();
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                }

            }
        }
        catch(IOException e){
            System.out.println(e);
        }

    }


    public static void main(String[] args) {
        EmployeeSkill employeeSkill = new EmployeeSkill();

        System.out.println("Please Enter the Organization name from which you want employees : ");
        Scanner sc = new Scanner(System.in);
        String OrganizationName = sc.nextLine();

        if(OrganizationName.equalsIgnoreCase("xebia")) {
            employeeSkill.xebia();
        }
        if(OrganizationName.equalsIgnoreCase("IBM")){
            employeeSkill.IBM();
        }
        if(OrganizationName.equalsIgnoreCase("google")){
            employeeSkill.google();
        }
        if(OrganizationName.equalsIgnoreCase("Microsoft")){
            employeeSkill.Microsoft();
        }

    }
}






















       /*
            int columnIndex1 = getColumnIndex(column1,header);
            int columnIndex2 = getColumnIndex(column2,header);
            int columnIndex3 = getColumnIndex(column3,header);
            */


//Google:---



//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\Company Profiles\\Google.csv"));
//            String line="";
//
//
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Enter the Name of Employee : ");
//            String skill1 = sc.nextLine();
//
//            System.out.println("Enter the Role of the Employee : ");
//            String skill2 = sc.nextLine();
//
//
//            /*
//            int columnIndex1 = getColumnIndex(column1,header);
//            int columnIndex2 = getColumnIndex(column2,header);
//            int columnIndex3 = getColumnIndex(column3,header);
//            */
//
//            List<Employee> employees = new ArrayList<>();
//
//
//            while ((line = bufferedReader.readLine())!=null){
//                String[] values = line.split(",");
//
//                String organizationName = values[0];
//                String EmployeeID = values[1];
//                String EmployeeName = values[2];
//                String Role = values[3];
//                String ParentSkill = values[4];
//                String SubSkill = values[5];
//                String Rating = values[6];
//
//                if(values[1].equals(skill1) && values[4].equals(skill2)){
//
//                    Employee employee = new Employee(organizationName,EmployeeID,EmployeeName,Role,ParentSkill,SubSkill,Rating);
//                    employees.add(employee);
//                    System.out.println(employee.getOrgName()+" "+employee.getEmployeeID()+""+employee.getEmployeeName()+" "+employee.getRole()+" "+employee.Skill+" "+employee.subSkill+" "+employee.skillLevel+" ");
//
//
//                    try {
//                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\DetailsOutput.csv"));
//                        bufferedWriter.write(employee.getOrgName()+","+employee.getEmployeeID()+","+employee.getEmployeeName()+","+employee.getRole()+","+employee.skill()+","+employee.subSkill()+","+employee.skillLevel());
//                        bufferedWriter.close();
//                    }
//                    catch(IOException e){
//                        System.out.println(e);
//                    }
//                }
//
//            }
//        }
//        catch(IOException e){
//            System.out.println(e);
//        }



//IBM:----


//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\Company Profiles\\IBM.csv"));
//            String line="";
//
//
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Enter the Name of Employee : ");
//            String skill1 = sc.nextLine();
//
//            System.out.println("Enter the Role of the Employee : ");
//            String skill2 = sc.nextLine();
//
//
//            /*
//            int columnIndex1 = getColumnIndex(column1,header);
//            int columnIndex2 = getColumnIndex(column2,header);
//            int columnIndex3 = getColumnIndex(column3,header);
//            */
//
//            List<Employee> employees = new ArrayList<>();
//
//
//            while ((line = bufferedReader.readLine())!=null){
//                String[] values = line.split(",");
//
//                String organizationName = values[0];
//                String EmployeeID = values[1];
//                String EmployeeName = values[2];
//                String Role = values[3];
//                String ParentSkill = values[4];
//                String SubSkill = values[5];
//                String Rating = values[6];
//
//                if(values[1].equals(skill1) && values[4].equals(skill2) ){
//
//                    Employee employee = new Employee(organizationName,EmployeeID,EmployeeName,Role,ParentSkill,SubSkill,Rating);
//                    employees.add(employee);
//                    System.out.println(employee.getOrgName()+" "+employee.getEmployeeID()+""+employee.getEmployeeName()+" "+employee.getRole()+" "+employee.Skill+" "+employee.subSkill+" "+employee.skillLevel+" ");
//
//
//                    try {
//                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\DetailsOutput.csv"));
//                        bufferedWriter.write(employee.getOrgName()+","+employee.getEmployeeID()+","+employee.getEmployeeName()+","+employee.getRole()+","+employee.skill()+","+employee.subSkill()+","+employee.skillLevel());
//                        bufferedWriter.close();
//                    }
//                    catch(IOException e){
//                        System.out.println(e);
//                    }
//                }
//
//            }
//        }
//        catch(IOException e){
//            System.out.println(e);
//        }







//Xebia:-----

//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\Company Profiles\\Xebia.csv"));
//            String line="";
//
//
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Enter the Employee name : ");
//            String skill1 = sc.nextLine();
//
//            System.out.println("Enter the Role of the Employee : ");
//            String skill2 = sc.nextLine();
//
//
//            /*
//            int columnIndex1 = getColumnIndex(column1,header);
//            int columnIndex2 = getColumnIndex(column2,header);
//            int columnIndex3 = getColumnIndex(column3,header);
//            */
//
//            List<Employee> employees = new ArrayList<>();
//
//
//            while ((line = bufferedReader.readLine())!=null){
//                String[] values = line.split(",");
//
//                String organizationName = values[0];
//                String EmployeeID = values[1];
//                String EmployeeName = values[2];
//                String Role = values[3];
//                String ParentSkill = values[4];
//                String SubSkill = values[5];
//                String Rating = values[6];
//
//                if(values[1].equals(skill1) && values[4].equals(skill2) ){
//
//                    Employee employee = new Employee(organizationName,EmployeeID,EmployeeName,Role,ParentSkill,SubSkill,Rating);
//                    employees.add(employee);
//                    System.out.println(employee.getOrgName()+" "+employee.getEmployeeID()+""+employee.getEmployeeName()+" "+employee.getRole()+" "+employee.Skill+" "+employee.subSkill+" "+employee.skillLevel+" ");
//
//
//                    try {
//                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\DetailsOutput.csv"));
//                        bufferedWriter.write(employee.getOrgName()+","+employee.getEmployeeID()+","+employee.getEmployeeName()+","+employee.getRole()+","+employee.skill()+","+employee.subSkill()+","+employee.skillLevel());
//                        bufferedWriter.close();
//                    }
//                    catch(IOException e){
//                        System.out.println(e);
//                    }
//                }
//
//            }
//        }
//        catch(IOException e){
//            System.out.println(e);
//        }







































//    String skill1 = "";
//    String skill2 = "";
//    String skill3 = "";
//
//    @Override
//    public void getSkillInput()
//        {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the Role of Employee : ");
//        skill1 = sc.nextLine();
//
//        System.out.println("Enter the Skill of the Employee : ");
//        skill2 = sc.nextLine();
//
//        System.out.println("Enter the SubSkill of the Employee : ");
//        skill3 = sc.nextLine();
//
//    }
//
//    @Override
//    public void getFileInput(String values1, String value2, String value3) {
//        List<Employee> employees = new ArrayList<>();
//        if (values1.equals(skill1) && value2.equals(skill2) && value3.equals(skill3)) {
//
//                    Employee employee = new Employee(orgName, EmployeeID, EmployeeName, role, Skill, subSkill, skillLevel);
//                    employees.add(employee);
//                    System.out.println(employee.getOrgName() + " " + employee.getEmployeeID() + "" + employee.getEmployeeName() + " " + employee.getRole() + " " + employee.Skill + " " + employee.subSkill + " " + employee.skillLevel + " ");
//
//                }
//
//    }
//    @Override
//    public void writeFileOutput() {
//        try {
//            Employee employee = new Employee();
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\DetailsOutput.csv"));
//            bufferedWriter.write(employee.getOrgName()+","+employee.getEmployeeID()+","+employee.getEmployeeName()+","+employee.getRole()+","+employee.skill()+","+employee.subSkill()+","+employee.skillLevel());
//            bufferedWriter.close();
//        }
//        catch(IOException e){
//            System.out.println(e);
//        }
//    }
//
//    public static void main(String[] args)
//    {
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\Details.csv"));
//            String line = "";
//
//
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] values = line.split(",");
//
//                String organizationName = values[0];
//                String EmployeeID = values[1];
//                String EmployeeName = values[2];
//                String Role = values[3];
//                String ParentSkill = values[4];
//                String SubSkill = values[5];
//                String Rating = values[6];
//
//                EmployeeSkill employeeSkill = new EmployeeSkill(organizationName, EmployeeID, EmployeeName, Role, ParentSkill, SubSkill, Rating);
//                employeeSkill.getSkillInput();
//                employeeSkill.getFileInput(values[4],values[5],values[6]);
//                employeeSkill.writeFileOutput();
//            }
//        }
//        catch(IOException e)
//        {
//            throw new RuntimeException(e);
//        }



//    @Override
//    public void getSkillInput() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the Role of Employee : ");
//        skill1 = sc.nextLine();
//
//        System.out.println("Enter the Skill of the Employee : ");
//        skill2 = sc.nextLine();
//
//        System.out.println("Enter the SubSkill of the Employee : ");
//        skill3 = sc.nextLine();
//
//    }


//    @Override
//    public void getFileInput(String skill1, String skill2, String skill3) {
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(`"C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\Details.csv"));
//            String line = "";
//            List<Employee> employees = new ArrayList<>();
//
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] values = line.split(",");
//
//                String organizationName = values[0];
//                String EmployeeID = values[1];
//                String EmployeeName = values[2];
//                String Role = values[3];
//                String ParentSkill = values[4];
//                String SubSkill = values[5];
//                String Rating = values[6];
//
//                if (values[4].equals(skill1) && values[5].equals(skill2) && values[6].equals(skill3)) {
//
//                    Employee employee = new Employee(organizationName, EmployeeID, EmployeeName, Role, ParentSkill, SubSkill, Rating);
//                    employees.add(employee);
//                    System.out.println(employee.getOrgName() + " " + employee.getEmployeeID() + "" + employee.getEmployeeName() + " " + employee.getRole() + " " + employee.Skill + " " + employee.subSkill + " " + employee.skillLevel + " ");
//                    writeFileOutput();
//                }
//            }
//        } catch(IOException e){
//            System.out.println(e);
//        }
//    }

//    @Override
//    public void writeFileOutput() {
//        try {
//            Employee employee = new Employee();
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\chitransh.mathur\\OneDrive - Xebia\\Documents\\JavaPrograms\\Skill Management System\\DetailsOutput.csv"));
//            bufferedWriter.write(employee.getOrgName()+","+employee.getEmployeeID()+","+employee.getEmployeeName()+","+employee.getRole()+","+employee.Skill+","+employee.subSkill+","+employee.skillLevel);
//            bufferedWriter.close();
//        }
//        catch(IOException e){
//            System.out.println(e);
//        }
//
//    }

//    public static void main(String[] args) {
//        EmployeeSkill employeeSkill = new EmployeeSkill();
//        employeeSkill.getSkillInput();
//        employeeSkill.getFileInput();
//    }
//}






 /*
  int columnIndex1 = getColumnIndex(column1,header);
  int columnIndex2 = getColumnIndex(column2,header);
  int columnIndex3 = getColumnIndex(column3,header);
  */