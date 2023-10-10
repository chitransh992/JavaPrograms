package TreeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
//        TreeSet<Employee> employeeSet = new TreeSet<Employee>(new NameComparator());
        HashSet<Employee> employeeSet = new HashSet<Employee>();
//        TreeSet<Employee> employeeSet = new TreeSet<Employee>(new SalaryComparator());

        Employee employee1 = new Employee("Roshan","3/8/2001",20000);
        Employee employee2 = new Employee("Aman","5/8/2002",50000);
        Employee employee3 = new Employee("Ramesh","4/5/2003",25000);
        Employee employee4 = new Employee("Shyam","5/6/2001",60000);
        Employee employee5 = new Employee("Ratan","6/7/2004",15000);
        Employee employee6 = new Employee("Roshan","3/8/2001",20000);


        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);
        employeeSet.add(employee6);

        for(Employee employee : employeeSet){
            employee.display();
        }
    }
}
