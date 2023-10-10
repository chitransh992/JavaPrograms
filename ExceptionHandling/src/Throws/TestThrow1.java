package Throws;

public class TestThrow1 {
    public static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Person is under age");
        }
        else
        {
            System.out.println("He is eligible");
        }
    }
    public static void main(String[] args) {
        validate(18);
        System.out.println("Rest of the code !!!");
    }
}
