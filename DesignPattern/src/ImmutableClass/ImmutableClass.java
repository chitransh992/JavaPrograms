package ImmutableClass;

final class ImmutableClass {               //The class is final class
    //Here the instance variables are private
    private String empName;
    private int empId;

    ImmutableClass(String empName,int empId){
        this.empName = empName;
        this.empId = empId;
    }
    //Only getter methods are present
    public String getName(){
        return empName;
    }
    public int getId(){
        return getId();
    }
}
