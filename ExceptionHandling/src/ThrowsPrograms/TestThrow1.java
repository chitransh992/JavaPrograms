package ThrowsPrograms;

public class TestThrow1 {
    public static void main(String[] args) {
      try{
          Example1 example1 = new Example1();
          example1.method();
      }
      catch (Exception e)
      {
          System.out.println(e);
      }
      System.out.println("Normal Flow !!!");
    }
}
