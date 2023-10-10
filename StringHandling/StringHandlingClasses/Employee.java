package StringHandlingClasses;

public class Employee {
    public final String pancardNumber;
    public Employee(String pancardNumber)
    {
        this.pancardNumber = pancardNumber;
    }

   public String getPanCardNumber(){
        return pancardNumber;
   }
}
