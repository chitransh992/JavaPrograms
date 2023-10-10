package ImmutableClass;

public class Main {
    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass("Ankit",101);

        System.out.println("Name of the Employee :"+immutableClass.getName());
        System.out.println("Id of the Employee :" +immutableClass.getId());
    }

}
