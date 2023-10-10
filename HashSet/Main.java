package HashSet;

import TreeSet.Employee;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Employee> hashSet = new HashSet<>();

        Employee employee1 = new Employee("Ankit","3/8/2001",20000);
        Employee employee2 = new Employee("Ramesh","3/5/2002",15000);
        Employee employee3 = new Employee("Ratan","3/4/2001",25000);
        Employee employee4 = new Employee("Ankit","3/8/2001",20000);
        Employee employee5 = new Employee("Ramesh","3/5/2002",15000);

        hashSet.add(employee1);
        hashSet.add(employee2);
        hashSet.add(employee3);
        hashSet.add(employee4);
        hashSet.add(employee5);


    }
}
