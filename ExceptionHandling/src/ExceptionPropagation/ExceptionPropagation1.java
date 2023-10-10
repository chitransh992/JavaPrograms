package ExceptionPropagation;

public class ExceptionPropagation1 {


    void example3()
    {
        int data = 50/0;
    }

    void example2()
    {
        example3();
    }

    void example1()
    {
        try{
            example2();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation1 obj = new ExceptionPropagation1();
        obj.example1();
        System.out.println("Normal Flow !!!");
    }
}
