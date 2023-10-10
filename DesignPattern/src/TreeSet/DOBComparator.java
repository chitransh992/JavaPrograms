package TreeSet;

import java.util.Comparator;

public class DOBComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1,Employee e2) {
        return e1.getDob().compareTo(e2.getDob());
    }

}
