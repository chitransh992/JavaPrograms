package TreeSet;

public class Employee {
    private String name;
    private String dob;
    private int salary;

    public Employee(String name,String dob,int salary){
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public String getDob(){
        return dob;
    }
    public int getSalary(){
        return salary;
    }

    public void display(){
        System.out.println("Employee Salary :"+getSalary());
    }
}
