package TryCatchBlock;

public class TRyCatch3 {
    public static void main(String[] args) {
        int first = 10;
        int second = 0;
        int result;
        try{
            result = first/second;
        }
        catch(ArrayIndexOutOfBoundsException e){   //Handling Arithmatic exception using ArrayIndexOutOfBound Exception
            System.out.println(e);
        }
    }
}
