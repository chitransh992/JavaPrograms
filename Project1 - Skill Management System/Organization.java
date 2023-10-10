import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Organization {
    private String orgID;
    private String nameOfOrganization;

    private static List<Employee> employees;


    public String getOrgID() {
        return orgID;
    }

    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public static List<Employee> getEp() {
        return employees;
    }
    public Organization(String orgID, String nameOfOrganization) {
        this.orgID = orgID;
        this.nameOfOrganization = nameOfOrganization;
        this.employees = new ArrayList<>();
    }
}
