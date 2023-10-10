package ImmutableClass;

import StringHandlingClasses.Employee;

public class ImmutableClass {
    public static void main(String[] args) {
        Employee employee = new Employee("ABC123");
        String string = employee.getPanCardNumber();
        System.out.println(string);
    }
}
