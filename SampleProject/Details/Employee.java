package Details;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String empID;
    private String nameOfEmployee;
    private String role;
    private List<Skills> skills;

    public Employee(String empID, String nameOfEmployee, String role) {
        this.empID = empID;
        this.nameOfEmployee = nameOfEmployee;
        this.role = role;
        this.skills = new ArrayList<>();
    }

    public String getEmpID() {
        return empID;
    }
    public String getNameOfEmployee() {
        return nameOfEmployee;
    }
    public String getRole() {
        return role;
    }
    public List<Skills> getLt() {
        return skills;
    }

}
